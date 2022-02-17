package ThisIsCT.Part05;

import java.util.*;

/*
5 6
101010
111111
000001
111111
111111
*/

public class P4 {
    static int n, m;
    static int[][] graph;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] temp = sc.nextLine().split("");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { x, y });

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int pollX = poll[0];
            int pollY = poll[1];

            for (int i = 0; i < 4; i++) {
                int nx = pollX + dx[i];
                int ny = pollY + dy[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                if (graph[nx][ny] == 1) {
                    q.add(new int[] { nx, ny });
                    graph[nx][ny] = graph[pollX][pollY] + 1;
                }
            }
        }
        return graph[n - 1][m - 1];
    }
}
