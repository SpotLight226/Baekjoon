
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

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 절댓값 기준으로 앞 값이 더 크다면 앞으로
                if(Math.abs(o1) > Math.abs(o2)){
                    return Math.abs(o1) - Math.abs(o2);
                // 절댓 값 기준으로 두 값이 같다면 음수를 앞으로
                } else if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                // 둘 다 양수면 그대로
                } else {
                    return -1;
                }
            }
        });

        while(n --> 0){
            int tmp = Integer.parseInt(br.readLine());

            if(tmp != 0){
                minHeap.offer(tmp);
            } else {

                if(minHeap.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(minHeap.poll()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}

