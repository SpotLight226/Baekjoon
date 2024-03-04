import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        dp = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;

        bw.write(String.valueOf(Fibonacci(n)));
        bw.flush();
        bw.close();
        br.close();
    }

    static long Fibonacci(int n) {
        if (dp[n] == -1) {
            dp[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
        }
            return dp[n];
    }

}
