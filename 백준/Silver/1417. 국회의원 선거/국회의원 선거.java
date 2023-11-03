import java.io.*;
import java.util.*;

public class Main {
   // 많은 사람을 맨 앞에 새우고 그 사람 표를 하나씩 뺐어서
   // 다시 많은 사람의 표를 하나씩 뺐고 결국 표가 가장 많은 사람보다
   // 다솜이의 표가 많으면 뺐은 표의 수를 출력
   public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int T = Integer.parseInt(br.readLine());
 
        int ans = 0;
        int first = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        
        for (int i = 0; i < T - 1; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }
        
        while(!pq.isEmpty() && first <= pq.peek()) {
            ans++;
            first++;
            pq.offer(pq.poll() - 1);
        }
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}