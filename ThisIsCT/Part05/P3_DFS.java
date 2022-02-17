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

public class P3_DFS {
    static int n, m;
    static String[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new String[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            graph[i] = str.split("");
        }

        int result = 0;
        //dfs를 실행하고 false가 return 되면 result++ 방문했다는 표시를 2로 해야되지 않을까?
        //모든 원소에 대해서 dfs를 호출해야하는건가봐....
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j) == true) {
                    result++;
                }
            }
        }
        System.out.println("result : " + result);
    }

    public static boolean dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        if (graph[x][y].equals("0")) {
            graph[x][y] = "2";
            dfs(x - 1, y); //상
            dfs(x, y + 1); //우
            dfs(x + 1, y); //하
            dfs(x, y - 1); //좌
            return true;
        }

        return false;
    }

}
