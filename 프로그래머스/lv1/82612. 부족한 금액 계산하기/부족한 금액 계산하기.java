import java.util.stream.LongStream;
class Solution {
    public long solution(int price, int money, int count) {
        
        long result = LongStream.range(1, count + 1).map(i -> price * i).sum()
                                - money;
        
        return (result < 0 ) ? 0 : result;
    }
}