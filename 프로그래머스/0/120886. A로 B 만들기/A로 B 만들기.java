import java.util.*;
class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> beforeHash = new HashMap<>(); // before의 해쉬 맵
        HashMap<Character, Integer> afterHash = new HashMap<>(); // after의 해쉬 맵

        for (int i = 0; i < before.length(); i++) {
            char beforeC = before.charAt(i);
            char afterC = after.charAt(i);
            // 각각의 해쉬 맵에 값이 없다면 0 + 1, 값이 있다면 그 값에 + 1 해서 저장
            beforeHash.put(beforeC, beforeHash.getOrDefault(beforeC, 0) + 1);
            afterHash.put(afterC, afterHash.getOrDefault(afterC, 0) + 1);
        }

        boolean check = true; // 가능한지 확인할 변수 
        // keySet으로 반복문
        for (char key : beforeHash.keySet()) {
            int beforeValue = beforeHash.get(key); // before 의 값
            int afterValue = afterHash.getOrDefault(key, 0); // after의 값 (없다면 0)
            // before 과 after가 다르면 check를 false로 만들고 반복 종료
            if (beforeValue != afterValue) {
                check = false;
                break;
            }
        }
        // check 가 true 면 1, false 면 0 반환
        return check ? 1 : 0;
    }
}