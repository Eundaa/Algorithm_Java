package Programmers.DFSnBFS;

import java.util.*;

class Solution {
    int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);

        return answer;
    }

    public void dfs(int[] numbers, int target, int index, int result) {
        if (index == numbers.length) {
            if (result == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, target, index + 1, result + numbers[index]);
        dfs(numbers, target, index + 1, result - numbers[index]);

    }
}