package Programmers.정렬;

import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] array = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.toString(numbers[i]);
        }
        //1이 리턴되면 그게 크다는 뜻
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return (str2 + str1).compareTo(str1 + str2);
            }
        });

        for (String str : array) {
            answer += str;
        }
        if (answer.charAt(0) == '0') {
            answer = "0";
        }
        return answer;
    }
}