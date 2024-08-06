class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" "); // 공백을 기준으로 나누어 배열로

            int temp = Integer.parseInt(arr[0]); // 첫 값
            
            // 연산자에 따라 계산, 계산할 숫자는 모두 인덱스 2에 위치
            if (arr[1].equals("+")) {
                temp += Integer.parseInt(arr[2]);
            } else {
                temp -= Integer.parseInt(arr[2]);
            }
            
            // 계산 값과 결과 값(인덱스 4에 위치한 값)이 같다면 O, 아니면 X를 answer 배열에 저장
            if (temp == Integer.parseInt(arr[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}