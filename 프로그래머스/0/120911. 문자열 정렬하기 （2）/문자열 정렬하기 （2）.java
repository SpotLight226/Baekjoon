import java.util.*;
class Solution {
    public String solution(String my_string) {
        /*
        // sb 이용해서 split한 배열을 정렬해 담아 리턴
        StringBuilder sb = new StringBuilder();
        
        String[] arr = my_string.toLowerCase().split("");
        
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
        */
        
        char[] arr = my_string.toLowerCase().toCharArray(); // 새로운 String 객체로 만들기 위해 char배열로
        Arrays.sort(arr); // 정렬
        
        return new String(arr);
    }
}