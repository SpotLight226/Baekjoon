import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 양수는 최대한 큰 값을 묶어야 하기 때문에 내림차순으로
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder()); // 양수
        // 음수는 최대한 작게 만들어야 하기 때문에 오름차순으로
        PriorityQueue<Integer> minus = new PriorityQueue<>(); 
        
        // 우선순위 큐를 사용하여 양수, 음수를 나누어 저장한 후
        // 양수는 큰 값으로 만들기 위해 내림차순 정렬 입력
        // 음수는 작은 값으로 만들기 위해 오름차순 정렬 입력
        // 각 우선순위 큐는 계산할 때, 
        // 양수의 경우 >> 서로 묶어주는 것이 더 커지지만, 만약 묶는 값 중 하나라도 1이라면
        //              오히려 손해이므로 그냥 더한다
        // 음수의 경우 >> 절대 값이 큰 값 끼리 묶어서 음수 * 음수 = 양수로 만들어 더한다
        //              작은 값들은 그냥 더한다
        int n = Integer.parseInt(br.readLine()); // 수의 개수

        while (n-- > 0) {
            int temp = Integer.parseInt(br.readLine());
            // 양수일 경우, plus 에
            if (temp > 0) {
                plus.offer(temp);
                // 음수일 경우, minus 에
            } else {
                minus.offer(temp);
            }
        }

        int answer = solve(plus) + solve(minus);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int solve(PriorityQueue<Integer> pq) {

        Queue<Integer> queue = new LinkedList<>();
        // pq가 비지 않을 때까지
        while (!pq.isEmpty()) {
            int i = pq.poll(); // 처음 거
            
            // PriorityQueue 의 마지막 숫자라면 더하기
            if (pq.isEmpty()) {
                queue.add(i);
            } else {
                int next = pq.poll(); // 다음 거
                // 만약 숫자 둘 중에 하나라도 1 이라면 곱(*) 한다면, 최댓값이 작아지기 때문에 그냥 더한다
                if (i == 1 || next == 1) {
                    queue.add(i);
                    queue.add(next);
                } else {
                    // 만약 둘 중 하나라도 1이 아니라면 곱(*)하는 게 더 커진다
                    queue.add(i * next);
                }
            }
        }
        // 결과 반환
        int result = 0;
        while (!queue.isEmpty()) {
            result += queue.poll();
        }
        return result;
    }
}