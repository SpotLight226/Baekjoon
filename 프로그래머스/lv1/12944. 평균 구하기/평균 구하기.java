import java.util.*;

class Solution {
    public double solution(int[] arr) {
        // 배열 arr을 스트림으로 만든 후, 평균을 구하고, double로 반환
        return Arrays.stream(arr).average().getAsDouble();
    }
}