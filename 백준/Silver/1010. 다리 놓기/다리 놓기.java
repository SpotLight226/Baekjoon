import java.io.*;
import java.util.*;

public class Main {

    static int[][] dp = new int[30][30]; // n, m 은 30 이하

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            // nCr 에서 mCn 이다 => m 개에서 n 개를 뽑음
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(bridge(m, n)).append("\n");
        }

        System.out.println(sb);
    }

    static int bridge(int m, int n) {

        // 계산 했을시 그대로 반환
        if (dp[m][n] > 0) {
            return dp[m][n];
        }

        if (m == n || n == 0) {
            return dp[m][n] = 1;
        }

        return dp[m][n] = bridge(m - 1, n - 1) + bridge(m - 1, n);
    }
}