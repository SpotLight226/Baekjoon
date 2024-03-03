import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        // 초콜릿 나누기
        // M x N 이라면 먼저 M - 1 번 쭉 쪼갠다
        // 다음 M 개로 나누어진 초콜릿을 N - 1 번 쪼갠다
        // M - 1 + M * ( N - 1 )
        // M - 1 + (M * N) - M
        // M * N - 1
        bw.write(String.valueOf(m * n - 1));
        bw.flush();
        bw.close();
        br.close();

    }
}
