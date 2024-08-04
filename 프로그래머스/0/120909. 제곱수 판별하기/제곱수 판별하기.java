class Solution {
    public int solution(int n) {
        int answer = 0;

            int sqrt = (int)Math.sqrt(n); // 제곱근

            return (sqrt * sqrt == n) ? 1 : 2; // sqrt^2 가 n 이라면 1, 아니면 2 반환
    }
}