
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // n 까지 1부터 queue 에 넣기
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (queue.size() > 1) {
            
            // k 번째가 되기 전까지 queue 에서 뺴낸 후 다시 넣는다
            for (int i = 0; i < k - 1; i++) {
                // queue 에서 빼낸 숫자를 다시 넣기
                queue.offer(queue.poll());
            }
            // k 번 째의 숫자를 sb에 넣는다
            sb.append(queue.poll()).append(", ");
        }
        
        // 마지막 숫자는 건너 뛰기가 없으므로 
        // 마지막에 넣고 > 를 추가
        sb.append(queue.poll()).append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}




