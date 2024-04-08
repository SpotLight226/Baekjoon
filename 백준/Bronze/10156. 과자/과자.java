import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken()); // 과자 한 개 가격
        int n = Integer.parseInt(st.nextToken()); // 개수
        int m = Integer.parseInt(st.nextToken()); // 현재 돈

        int answer = (k*n) - m;

        if (answer < 0) {
            answer = 0;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}