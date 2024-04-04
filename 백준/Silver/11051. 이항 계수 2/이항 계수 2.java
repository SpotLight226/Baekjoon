import java.io.*;
import java.util.*;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[n + 1][k + 1];

        int result = solve(n, k);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    // nCk = (n-1)C(k-1) + (n-1)Ck
    // 모듈러 연산
    // ( a + b ) % M = ((a % M) + (b % M)) % M

    // 파스칼의 삼각형
    //              (0,0)
    //         (1,0)   (0,1)
    //    (2,0)   (2,1)   (2,2)
    //(3,0)   (3,1)   (3,2)   (3,3)
    static int solve(int n, int k) {

        if(arr[n][k] != 0) return arr[n][k];

        if (n == k || k == 0) {
            arr[n][k] = 1;
        } else {
            arr[n][k] = (solve(n - 1, k - 1) + solve(n - 1, k)) % 10007;
        }
        return arr[n][k];
    }
}