import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
       List<Integer> scoreList = new ArrayList<>();
        // 각 학생의 점수 합산을 리스트에 저장
        for (int[] arr : score) {
            scoreList.add(arr[0] + arr[1]);
        }
        // 내림차순으로 정렬
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            int currentScore = score[i][0] + score[i][1]; // 현재 학생의 점수
            // 점수 리스트에서 현재 점수가 처음 나타나는 인덱스를 찾아서 순위 저장
            answer[i] = scoreList.indexOf(currentScore) + 1;
        }

        return answer;
    }
}