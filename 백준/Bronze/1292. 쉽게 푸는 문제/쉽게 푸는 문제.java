import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;

        for (int i = 1; ; i++) {
            // 각 단계에서 반복 횟수
            for (int j = 1; j <= i; j++) {
                count++; // 횟수 증가
                if (a <= count && count <= b) {
                    answer += i;
                }
            }
            if (count > b) {
                break;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
