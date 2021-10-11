package Programmers.Weekly;

import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int[] heightList = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            int minTemp = 1001;
            for (int j = 0; j < 2; j++) {
                if (maxWidth < sizes[i][j]) {
                    maxWidth = sizes[i][j];
                }
                if (minTemp > sizes[i][j]) {
                    minTemp = sizes[i][j];
                }
            }
            heightList[i] = minTemp;
        }
        Arrays.sort(heightList);
        int maxHeight = heightList[sizes.length - 1];
        return maxWidth * maxHeight;
    }
}