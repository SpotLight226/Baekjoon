import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            float n = Float.parseFloat(st.nextToken());

            while (st.hasMoreTokens()) {
                String c = st.nextToken();

                switch (c) {
                    case "@":
                        n = n * 3;
                        break;
                    case "%":
                        n = n + 5;
                        break;
                    case "#":
                        n = n - 7;
                        break;
                    default:
                        break;
                }
            }

            sb.append(String.format("%.2f", n)).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
