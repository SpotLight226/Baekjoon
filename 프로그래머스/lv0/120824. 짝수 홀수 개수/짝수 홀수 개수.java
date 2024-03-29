import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        answer[0] = (int) Arrays.stream(num_list).boxed().filter(i -> i % 2 == 0).count();
        answer[1] = (int) Arrays.stream(num_list).boxed().filter(i -> i % 2 == 1).count();
        
        return answer;
    }
}