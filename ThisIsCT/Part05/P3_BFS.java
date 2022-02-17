package ThisIsCT.Part05;

import java.util.*;

/*
4 5
00110
00011
11111
00000

5 5
00110
00011
11111
00000
11100
*/

public class P3_BFS {
    static int n, m;
    static Integer[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new Integer[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] temp = str.split("");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (bfs(i, j)) {
                    result++;
                }
            }
        }

        System.out.println("result : " + result);
    }

    public static boolean bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        if (graph[x][y] == 0) {
            q.add(new int[] { x, y });
        } else {
            return false;
        }

        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int tempX = poll[0];
            int tempY = poll[1];
            graph[tempX][tempY] = 2;
            for (int i = 0; i < 4; i++) {
                int nx = tempX + dx[i];
                int ny = tempY + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (graph[nx][ny] == 0) {
                    q.add(new int[] { nx, ny });
                    graph[nx][ny] = 2;
                }
            }
        }

        return true;
    }
}
