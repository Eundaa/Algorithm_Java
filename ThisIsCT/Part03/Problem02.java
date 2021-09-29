package ThisIsCT.Part03;

import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int max1 = list[n - 1];
        int max2 = list[n - 2];

        int sum = 0;
        int count = 1;

        // for (int i = 0; i < m; i++) {
        while (true) {
            sum += max1;
            count++;
            m -= 1;
            if (count == k + 1) {
                sum += max2;
                count = 1;
                m -= 1;
            }
            if (m == 0) {
                break;
            }
        }

        System.out.println(sum);
    }
}