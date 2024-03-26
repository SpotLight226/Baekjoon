import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 횟수
        HashMap<Long, Integer> hash = new HashMap<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();

        while (n-- > 0) {
            long in = Long.parseLong(br.readLine());
            // getOrDefault : 입력 key 의 value 가 없다면 default 는 0으로 있다면 해당 value 에 + 1
            hash.put(in, hash.getOrDefault(in, 0) + 1); // 있다면 +1 해서 넣고, 없다면 1을 넣는다
        }

        List<Integer> list = new ArrayList<>(hash.values()); // hashMap 의 value 들로 list 를 만든다
        int max = 0; // 최대값 찾기
        for (Integer i : list) {
            if(max < i) max = i;
        }

        // keySet : hash 에서 key 들만 빼서 반복문 돌린다
        // 우선순위 큐에 hash 의 key 에 따른 value 를 최대값과 같다면 넣는다
        // 가장 작은 숫자를 출력하라고 했으므로
        for (Long key : hash.keySet()) {
            if(max == hash.get(key)) queue.add(key);
        }

        bw.write(String.valueOf(queue.poll()));
        bw.flush();
        bw.close();
        br.close();
    }
}
