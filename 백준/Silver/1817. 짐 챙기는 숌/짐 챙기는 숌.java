import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 책 개수
        int m = Integer.parseInt(st.nextToken()); // 박스 무게

        if (n == 0) {
            bw.write("0");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        st = new StringTokenizer(br.readLine());

        int answer = 1;
        int weight = 0;

        while (n-- > 0) {
            int temp = Integer.parseInt(st.nextToken());
            weight += temp;

            if (weight > m) {
                answer++;
                weight = temp;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }
}
