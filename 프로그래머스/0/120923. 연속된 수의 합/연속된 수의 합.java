class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 중간 값 = total / num 
        // 시작 값 = 중간 값에서 num / 2 를 뺀 값
        int start = total / num - num / 2;

        if (total % num != 0) {
            start++;
        }

        for (int i = 0; i < num; i++) {
            answer[i] = start++;
        }

        return answer;
    }
}