import java.util.*;
class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> beforeHash = new HashMap<>();
        HashMap<Character, Integer> afterHash = new HashMap<>();

        for (int i = 0; i < before.length(); i++) {
            char beforeC = before.charAt(i);
            char afterC = after.charAt(i);

            beforeHash.put(beforeC, beforeHash.getOrDefault(beforeC, 0) + 1);
            afterHash.put(afterC, afterHash.getOrDefault(afterC, 0) + 1);
        }

        boolean check = true;

        for (char key : beforeHash.keySet()) {
            int beforeValue = beforeHash.get(key);
            int afterValue = afterHash.getOrDefault(key, 0);

            if (beforeValue != afterValue) {
                check = false;
                break;
            }
        }
        
        return check ? 1 : 0;
    }
}