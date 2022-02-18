package Programmers.정렬;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int n = 0; n < commands.length; n++) {
            int[] temp = commands[n];
            int i = temp[0];
            int j = temp[1];
            int k = temp[2];

            int[] tempArray = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(tempArray);
            answer[n] = tempArray[k - 1];
        }

        return answer;
    }
}