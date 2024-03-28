import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        // Collections.reverseOrder 로 내림차순 정렬이되는 우선순위 큐를 만든다
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            // n 줄이 입력되므로 st 로 나눈다
            st = new StringTokenizer(br.readLine());
            // 우선순위 큐에 넣기
            for (int j = 0; j < n; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }
        // n 번째 숫자가 되도록 큐에서 뺀다
        for (int i = 0; i < n - 1; i++) {
            queue.remove();
        }

        bw.write(String.valueOf(queue.poll()));
        bw.flush();
        bw.close();
        br.close();
    }
}
