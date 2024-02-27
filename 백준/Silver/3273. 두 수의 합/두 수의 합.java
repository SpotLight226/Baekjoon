import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 오름차순 정렬
 
        int x = Integer.parseInt(br.readLine());
        int answer = 0;

        int p1 = 0; // 왼쪽 포인터
        int p2 = n - 1; // 오른쪽 포인터

        while (p1 < p2) {
            int sum = arr[p1] + arr[p2]; // 합
            if (sum == x) { // 합이 x와 같다면
                answer++; // 개수 +1
                p1++; // 왼쪽 포인터 한칸 오른쪽으로
                p2--; // 오른쪽 포인터 한칸 왼쪽으로
            } else if (sum > x) { // 합이 더 크다면
                p2--; // 오른쪽 포인터 한칸 왼쪽
            } else { // 합이 작다면
                p1++; // 왼쪽 포인터 한칸 오른쪽
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }
}
