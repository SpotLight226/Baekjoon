
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        while(n --> 0){
            int tmp = Integer.parseInt(br.readLine());

            if(tmp != 0){
                minHeap.add(tmp);
            } else {
                if(minHeap.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(minHeap.poll()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}

