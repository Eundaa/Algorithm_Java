package ThisIsCT.Part03;

import java.util.*;

/*
3 3
3 1 2
4 1 4
2 2 2

2 4
7 3 1 8
3 3 3 4
*/
public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] minNumbers = new int[n];
        int[][] cards = new int[n][m];

        for (int i = 0; i < n; i++) {
            int min = 10001;
            for (int j = 0; j < m; j++) {
                cards[i][j] = sc.nextInt();
                if (min > cards[i][j]) {
                    min = cards[i][j];
                }
            }
            minNumbers[i] = min;
        }

        Arrays.sort(minNumbers);
        System.out.println(minNumbers[n - 1]);
    }
}
