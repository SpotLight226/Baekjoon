import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 합이 n, 0 부터 n 까지
        int k = Integer.parseInt(st.nextToken()); // 몇개의 정수가 합쳐져야 하는가

        int[][] dp = new int[k + 1][n + 1];

        Arrays.fill(dp[1], 1);
        for (int i = 1; i <= k; i++) {
            dp[i][0] = 1;
        }

        for (int i = 2; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                dp[i][j] %= 1000000000;
            }
        }

        bw.write(String.valueOf(dp[k][n]));
        bw.flush();
        bw.close();
        br.close();
    }
}