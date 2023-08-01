import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String> list = Arrays.asList(my_string.split(""));

        Collections.reverse(list);
        
        return String.join("", list);
    }
}