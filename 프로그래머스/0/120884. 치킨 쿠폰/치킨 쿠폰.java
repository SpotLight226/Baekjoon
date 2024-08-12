class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int temp = 0;

        while (chicken >= 10) {
            temp = chicken / 10;
            answer += temp;
            chicken = (chicken % 10) + temp;
            temp = 0;
        }
        return answer;
    }
}