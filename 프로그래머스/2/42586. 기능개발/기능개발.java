import java.util.*;

class Solution {
    public ArrayList solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        while (!queue.isEmpty()) {

            int min = queue.poll();

            int count = 1;

            while (!queue.isEmpty() && min >= queue.peek()) {
                queue.poll();
                count++;
            }

            answer.add(count);

        }

        return answer;
    }
}