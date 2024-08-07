class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n; // answer 배열의 길이
 
        if(my_str.length() % n != 0) length++; // 만약 my_str이 n으로 딱 나누어지지 않으면 길이에 + 1

        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            if (my_str.length() > n) { // my_str의 길이가 n 보다 길다면
                answer[i] = my_str.substring(0, n); // 잘라서 넣고
                my_str = my_str.substring(n, my_str.length()); // 넣은 부분을 잘라서 재 정의
            } else {
                answer[i] = my_str; // n보다 짧다면 그대로 넣기
            }
        }
        
        return answer;
    }
}