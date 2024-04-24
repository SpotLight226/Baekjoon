import java.io.*;
import java.util.*;

public class Main {

    static class Gem implements Comparable<Gem> {
        int m; // 무게
        int v; // 가격
        // 생성자
        public Gem(int m, int v) {
            this.m = m;
            this.v = v;
        }
        // 정렬 조건
        @Override
        public int compareTo(Gem o) {
            return this.m - o.m;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 보석 개수
        int k = Integer.parseInt(st.nextToken()); // 가방 개수

        List<Gem> gems = new ArrayList<>();
        int[] bag = new int[k];
        
        // 보석 저장
        for(int i = 0; i <n; i++) {
            st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken()); // 보석 무게
            int v = Integer.parseInt(st.nextToken()); // 보석 가격

            gems.add(new Gem(m, v));
        }
        
        // 가방 저장
        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }

        Collections.sort(gems);
        Arrays.sort(bag);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long answer = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            while (count < n) {
                Gem gem = gems.get(count); // 보석

                if(bag[i] < gem.m) break;

                pq.add(gem.v);
                count++;
            }

            if (!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}