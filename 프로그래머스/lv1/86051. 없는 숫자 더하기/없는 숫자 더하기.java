import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        return answer -= Arrays.stream(numbers).sum();
    }
}