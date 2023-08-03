import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = new int[emergency.length];

        for(int i = 0; i < emergency.length; i++){
            arr[i] = emergency[i];
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length /2; i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = tmp;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], i+1);
        }

        int[] answer = new int[arr.length];

        for(int i = 0; i < answer.length; i++){
            answer[i] = map.get(emergency[i]);
        }
        
        return answer;
    }
}