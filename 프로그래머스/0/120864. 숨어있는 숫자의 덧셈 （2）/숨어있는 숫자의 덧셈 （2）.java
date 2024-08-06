class Solution {
    public int solution(String my_string) {
        int temp = 0;
        int answer = 0;
        
        char[] arr = my_string.toCharArray();

        for (char c : arr) {
            // c 가 숫자라면 temp에 임시 저장
            // 뒤에 글자도 숫자라면 temp * 10 해서 기존 임시 저장된 숫자의 자릿수를 올려서 임시 저장
            if (Character.isDigit(c)) {
                temp = temp * 10 + Character.getNumericValue(c);
            } else {
                // 다음 글자가 숫자가 아니라면 answer에 그대로 temp를 저장
                answer += temp;
                temp = 0;
            }
        }

        answer += temp;
        
        return answer;
    }
}