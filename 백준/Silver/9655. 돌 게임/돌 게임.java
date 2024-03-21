import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 돌 개수
        int[] dp = new int[1001];
        // 최소값을 설정한다
        dp[1] = 1; // 상근이 1개 가져가서 상근 이김
        dp[2] = 2; // 상근이 1개, 창영이 1개 가져가서 창영 이김
        dp[3] = 1; // 상근이 3개 가져가서 상근 이김
        // dp 배열(최소값 배열)에서 홀수면 상근 승, 짝수면 창영 승
        for (int i = 4; i <= n; i++) {
            // dp[3] = 1, dp[1] = 1
            // dp[4] = 2
            dp[i] = Math.min(dp[i - 1], dp[i - 3]) + 1;
        }

        if (dp[n] % 2 == 0) {
            bw.write("CY");
        } else {
            bw.write("SK");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
