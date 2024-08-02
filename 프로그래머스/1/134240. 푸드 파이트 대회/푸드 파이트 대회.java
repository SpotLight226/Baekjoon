import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);

        for (int i = food.length - 1; i > 0; i--) {
            if (food[i] % 2 != 0) {
                food[i] -= 1;
            }

            for (int j = 0; j < food[i] / 2; j++) {
                deque.addFirst(i);
                deque.addLast(i);
            }
        }

        for (int i : deque) {
            sb.append(i);
        }

        return sb.toString();
    }
}