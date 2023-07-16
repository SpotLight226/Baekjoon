import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        String answer = "";

        for(String s : arr){
            answer += s;
        }
        
        return Long.parseLong(answer);
    }
}