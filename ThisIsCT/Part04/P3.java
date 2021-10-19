package ThisIsCT.Part04;

import java.util.*;
/*
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1
*/

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dir = sc.nextInt();
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        map[x][y] = 2;
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };

        int count = 0;
        boolean cango = true;
        while (cango) {
            dir--;
            if (dir == -1) {
                dir = 3;
            }
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (map[nx][ny] == 0) {
                x = nx;
                y = ny;
                map[x][y] = 2;
                count = 0;
                continue;
            } else {
                count++;
            }

            if (count == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];
                if (map[nx][ny] == 1) {
                    cango = false;
                } else {
                    x = nx;
                    y = ny;
                    count = 0;
                }
            }
        }
        int visited = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2) {
                    visited++;
                }
            }
        }
        System.out.println(visited);

    }
}
