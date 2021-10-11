package ThisIsCT.Part04;

import java.util.*;
/*
5
R R R U D D
*/

public class P1_1 {
    // 상하좌우
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");
        int[] dy = { -1, 1, 0, 0 };
        int[] dx = { 0, 0, -1, 1 };
        String[] moveTypes = { "L", "R", "U", "D" };
        int[] traveler = { 1, 1 };

        for (String plan : plans) {
            int nx = 0;
            int ny = 0;
            for (int i = 0; i < moveTypes.length; i++) {
                if (plan.equals(moveTypes[i])) {
                    nx = traveler[0] + dx[i];
                    ny = traveler[1] + dy[i];
                }
            }
            if (nx < 1 || nx > n || ny < 1 || ny > n) {
                continue;
            }
            traveler[0] = nx;
            traveler[1] = ny;
        }
        System.out.println(traveler[0] + " " + traveler[1]);
    }
}
