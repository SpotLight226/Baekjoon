import java.util.*;

class Solution {
    public static List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] score = new int[3];

        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] test3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == test1[i % 5]) score[0]++; // 찍는 숫자가 5개 이므로 %5
            if (answers[i] == test2[i % 8]) score[1]++; // 찍는 숫자가 8개 이므로 %8
            if (answers[i] == test3[i % 10]) score[2]++; // 찍는 숫자가 10개 이므로 %10
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        for (int i = 0; i < 3; i++) {
            if(max == score[i]) answer.add(i + 1);
        }

        return answer;
    }
}