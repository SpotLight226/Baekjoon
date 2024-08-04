import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        HashSet<String> set1 = new HashSet<>(List.of(s1));

        for (int i = 0; i < s2.length; i++) {
            if (set1.contains(s2[i])) {
                answer++;
            }
        }
        
        
        return answer;
    }
}