
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        // 우선 순위 큐
        PriorityQueue<Integer> cards = new PriorityQueue<>();

       while (n --> 0){
           int card = Integer.parseInt(br.readLine());
           cards.offer(card);
       }
        
       int result = 0;
       // 큐에 2개 이상 있을 때만 실행 
       while(cards.size() > 1){
           int tmp1 = cards.poll();
           int tmp2 = cards.poll();
           // 결과에 2개 더한 값 누적하고
           result += tmp1 + tmp2;
           // 합친 값 다시 넣기
           cards.offer(tmp1 + tmp2);
       }

        System.out.println(result);
    }
}

