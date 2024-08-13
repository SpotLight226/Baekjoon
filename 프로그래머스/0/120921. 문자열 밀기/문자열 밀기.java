import java.util.*;
class Solution {
    public int solution(String A, String B) {
        // 처음 부터 같다면 return 0
        if (A.equals(B)) return 0;

        int length = A.length();

        Deque<Character> deque = new LinkedList<>();
        for (char c : A.toCharArray()) {
            deque.add(c);
        }

        for (int i = 1; i < length; i++) {
            deque.addFirst(deque.pollLast());

            StringBuilder sb = new StringBuilder();
            for (char ch : deque) {
                sb.append(ch);
            }

            if (sb.toString().equals(B)) {
                return i;
            }
        }

        return -1;
    }
}