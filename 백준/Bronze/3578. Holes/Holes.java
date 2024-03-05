import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(br.readLine());

        // h 가 0 이라면 1
        // h 가 4,6,9 라면 1
        // h 가 8 이라면 2
        // h 가 다른 수 라면 0

        if (h == 0) {
            sb.append("1");
        } else if (h == 1) {
            sb.append("0");
        } else {
            // 4,6,9 중에 가장 작은 4
            // 구멍의 개수가 3 이라면 가장 작은 수인 4를 치고,
            // 2개를 뚫는 8을 친다
            // h가 1이 아닌 홀 수 일 때, 즉 1을 뚫을 수 있는 4를 치고
            // 남은 것은 8을 2 배수 만큼 친다
            if (h % 2 == 1) {
                sb.append("4");
            }
            // 짝 수라면 8을 2의 배수 만큼 친다
            sb.append("8".repeat(h / 2));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
