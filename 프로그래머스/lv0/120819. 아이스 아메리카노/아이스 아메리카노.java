import java.util.stream.IntStream;
class Solution {
    public int[] solution(int money) {
        
        return IntStream.builder().add(money / 5500).add(money % 5500).build().toArray();
    }
}