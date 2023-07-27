class Solution {
    public int solution(int n) {
        String result = "";
        while(n > 0 ){
            result += n%3;
            n /= 3;
        }

        int answer = 0;
        for(int i = result.length()-1; i >= 0; i--){
            int num = result.charAt(i)-'0';
            answer += (int) Math.pow(3, result.length()- i -1) * num;
        }
        return answer;
    }
}