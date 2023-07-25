import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        // 스트림
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }
}