package ThisIsCT.Part04;

import java.util.*;

public class P1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
        idea1 : 0시~0시59분59초에서 3 포함 개수를 hourCount라고 할 때,
        count = hourCount*(3이 없는 n의개수) + 3600*(3이 포함된 n의 개수)
        hourCount는 1575개이다.
        /*
        
        // int m = 59;
        // int s = 59;
        // int hourCount = 0;
        // for (int i = 0; i <= m; i++) {
        //     String stringM = Integer.toString(i);
        //     if (stringM.contains("3")) {
        //         hourCount += 60;
        //         continue;
        //     }
        //     for (int j = 0; j <= s; j++) {
        //         String stringS = Integer.toString(j);
        //         if (stringS.contains("3")) {
        //             hourCount++;
        //             continue;
        //         }
        //     }
        // }
        
        // int count = 0;
        // for (int i = 0; i <= n; i++) {
        //     if (Integer.toString(i).contains("3")) {
        //         count += 3600;
        //     } else {
        //         count += hourCount;
        //     }
        // }
        // System.out.println(count);
        
        /*
         * idea2 : 경우의수가 86400개이기 때문에 3중포문이 가능하다. 시분초를 string으로 만들어서 3이 포함되는 경우를 count++
         */
        int count = 0;
        for (int h = 0; h <= n; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String time = Integer.toString(h) + Integer.toString(m) + Integer.toString(s);
                    if (time.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
