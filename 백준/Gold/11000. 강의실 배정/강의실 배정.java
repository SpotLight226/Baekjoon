import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 시작 시간을 비교해서 오름차순 정렬하고, 시작 시간이 같다면, 종료 시간을 비교하여 정렬한다
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(arr[0][1]); // 첫번째 값 넣기

        for (int i = 1; i < n; i++) {
            if (pQueue.peek() <= arr[i][0]) {
                pQueue.poll();
            }
            pQueue.add(arr[i][1]);
        }

        bw.write(String.valueOf(pQueue.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}