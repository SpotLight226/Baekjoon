class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");

        int answer = Integer.parseInt(arr[0]); // 첫 값
        
        // 연산자는 무조건 인덱스가 홀수인 곳에서만 등장한다
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) { // 홀수라면
                if (arr[i].equals("+")) { // + 시 다음 요소를 더하기
                    answer += Integer.parseInt(arr[i + 1]);
                } else { // - 라면 다음 요스를 빼기
                    answer -= Integer.parseInt(arr[i + 1]);
                }
            }
        }
        
        return answer;
    }
}