class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201]; // 선분 좌표

        for (int[] line : lines) {
            int start = line[0] + 100; // 음수라도 + 100 하면 0으로 시작
            int end = line[1] + 100; // 200까지니 + 100
            for (int i = start; i < end; i++) {
                arr[i]++; // 선분 표시
            }
        }
        
        // 좌표를 순회하며 1 이상이면 겹치는 부분
        for (int i = 0; i < 201; i++) {
            if(arr[i] > 1) answer++;
        }

        return answer;
    }
}