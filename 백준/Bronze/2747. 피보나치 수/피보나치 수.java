import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
    
        bw.write(String.valueOf(calcFibonacci(n)));
        bw.flush();
        bw.close();
        br.close();
    }
        
    /*
    재귀는 시간 복잡도가 높아 시간초과
    static int calcFibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            return calcFibonacci(n - 1) + calcFibonacci(n - 2);
        }
    }
    */
    
    static int calcFibonacci(int n) {

        if(n <= 1) return n;

        dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}