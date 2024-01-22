import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 수

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); //수
            int[] fibonacci1 = new int[41];
            int[] fibonacci2 = new int[41];
            fibonacci1[0] = 1;
            fibonacci1[1] = 0;
            fibonacci2[0] = 0;
            fibonacci2[1] = 1;
            for (int i = 2; i <= n; i++) {
                fibonacci1[i] = fibonacci1[i - 1] + fibonacci1[i - 2];
                fibonacci2[i] = fibonacci2[i - 1] + fibonacci2[i - 2];
            }

            bw.write(fibonacci1[n] + " " + fibonacci2[n]);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}