import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {  // 앞에 문자 없을 시 
                answer[i] = -1; // answer 배열에 -1 
                hashMap.put(s.charAt(i), i); // 해당 문자와 현재 인덱스를 넣는다
            } else {
                answer[i] = i - hashMap.get(s.charAt(i)); // i(현재 문장에서의 인덱스) - 이전 문자의 인덱스
                hashMap.put(s.charAt(i), i); // hashmap 에서의 문자 위치 인덱스 업데이트
            }
        }

        return answer;
    }
}