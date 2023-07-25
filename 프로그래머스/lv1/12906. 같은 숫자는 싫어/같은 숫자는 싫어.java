import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int[] answer = cal(arr);
        return answer;
    }

    static int[] cal(int[] arr){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }

        int[] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }
}