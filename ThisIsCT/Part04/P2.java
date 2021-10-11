package ThisIsCT.Part04;

import java.util.*;
/* 
a1 -> 2
c2 -> 6
*/

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String spot = sc.next();

        int[] dx = { 2, 2, -2, -2, 1, 1, -1, -1 };
        int[] dy = { 1, -1, 1, -1, 2, -2, 2, -2 };
        int x = (int) spot.charAt(0) - 96;
        int y = (int) spot.charAt(1) - 48;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 1 || ny < 1) {
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
