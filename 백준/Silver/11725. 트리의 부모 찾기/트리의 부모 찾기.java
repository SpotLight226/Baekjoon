import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        // 트리 구조
        // ArrayList 을 각 요소로 하는 배열
        ArrayList<Integer>[] tree = new ArrayList[n + 1];
        boolean[] visit = new boolean[n + 1]; // 방문했는지 확인하는 배열
        int[] answer = new int[n + 1]; // 부모 배열

        for (int i = 1; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            tree[p].add(s);
            tree[s].add(p);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 트리의 루트는 1
        visit[1] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll(); // 현재 부모 노드
            // 현재 부모 노드를 인덱스로 가져온 ArrayList 내부의 요소를 꺼내어 반복
            for (int next : tree[now]) {
                // 각 부모 노드의 자식 노드 = int next
                // 해당 노드를 확인하지 않았다면
                if (!visit[next]) {
                    visit[next] = true; // 확인 처리
                    queue.add(next); // 다음에 확인할 자식 노드
                    answer[next] = now; // 현재 자식 노드의 부모를 answer 에 넣기
                }
            }
        }

        for (int i = 2; i < n + 1; i++) {
            sb.append(answer[i]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}