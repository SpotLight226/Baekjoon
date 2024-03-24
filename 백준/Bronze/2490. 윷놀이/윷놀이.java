import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());

            }

            switch (sum) {
                case 0:
                    sb.append("D").append("\n"); // 모
                    break;
                case 1:
                    sb.append("C").append("\n"); // 도
                    break;
                case 2:
                    sb.append("B").append("\n"); // 개
                    break;
                case 3:
                    sb.append("A").append("\n"); // 걸
                    break;
                case 4:
                    sb.append("E").append("\n"); // 윹
                    break;
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
