import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 날짜의 수
        int k = Integer.parseInt(st.nextToken()); // 연속적인 날짜

        int[] arr = new int[n + 1];

        // 미리 입력 값들의 누적 합들을 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        int answer = -10000001;
        for (int i = k; i <= n; i++) {
            int sum = arr[i] - arr[i - k];
            if(answer < sum) answer = sum;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}