import java.io.*;
import java.util.*;

public class Main {

    static LinkedList<Integer> dq = new LinkedList<>();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 큐의 크기
        int m = Integer.parseInt(st.nextToken()); // 뽑아내려고 하는 개수

        // 1 ~ n 까지 넣기
        for (int i = 1; i <= n; i++) {
            dq.offer(i);
        }

        // 뽑을 수
        arr = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int count = 0;

        for (int i = 0; i < m; i++) {
            // 중간보다 앞이라면
            if (check(arr[i])) {
                // 타겟이 dq의 가장 앞에 있는지 확인
                while (arr[i] != dq.get(0)) {
                    // 앞에서 빼서, 뒤로 넣기
                    dq.offerLast(dq.pollFirst());
                    count++;
                }
            } else {
                while (arr[i] != dq.get(0)) {
                    // 뒤에서 빼서 앞으로 넣기
                    dq.offerFirst(dq.pollLast());
                    count++;
                }
            }
            // 가장 앞에 잇다면 뺀다
            dq.poll();
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
    
    // 해당 타겟이 dq 안에서 중간보다 앞인지 뒤인지 확인
    static boolean check(int n) {

        for(int i = 0 ; i <= dq.size()/2 ; i++) {
            if(n == dq.get(i))
                return true;
        }
        return false;
    }
}