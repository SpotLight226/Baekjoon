import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int n = numbers.length; // numbers 의 길이

        int temp1 = numbers[0] * numbers[1]; // 가장 큰 수 2개의 곱
        int temp2 = numbers[n - 2] * numbers[n - 1]; // 가장 작은 수 2개의 곱(음수 * 음수 = 양수 이므로)

        return Math.max(temp1, temp2);
    }
}