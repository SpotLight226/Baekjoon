import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();
        /*
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {  // 앞에 문자 없을 시 
                answer[i] = -1; // answer 배열에 -1 
                hashMap.put(s.charAt(i), i); // 해당 문자와 현재 인덱스를 넣는다
            } else {
                answer[i] = i - hashMap.get(s.charAt(i)); // i(현재 문장에서의 인덱스) - 이전 문자의 인덱스
                hashMap.put(s.charAt(i), i); // hashmap 에서의 문자 위치 인덱스 업데이트
            }
        }
        */
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            // 위 코드에서 if 문으로 처리한 것을 getOrDefault 로 처리
            // hashMap에서 c를 key로 value를 가져올 때, hashMap에 없다면 i + 1을 반환
            answer[i] = i-hashMap.getOrDefault(c,i+1);
            hashMap.put(c,i);
        }

        return answer;
    }
}