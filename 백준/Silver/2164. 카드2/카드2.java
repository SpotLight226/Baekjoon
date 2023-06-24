import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 1; i <= n; i++){
            // queue 의 끝에다가 i를 추가
            queue.offerLast(i);
        }
        
        while(n --> 0){
            // queue 의 길이가 1일 때, while 문을 끝낸다
            if(queue.size() == 1){
                break;
            }

            queue.pollFirst(); // 가장 앞의 것 꺼내기

            int num = queue.pollFirst(); // 그 뒤의 것 꺼내기
            queue.offerLast(num); // 꺼낸 것을 다시 뒤에 넣기
        }
        
        // 마지막에 남아있는 수를 꺼낸다
        System.out.println(queue.poll());
    }
}

