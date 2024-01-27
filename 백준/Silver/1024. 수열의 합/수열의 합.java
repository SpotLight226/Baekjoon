import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        br.close();

        while (true) {
            int start = n / l - ((l - 1) / 2); // 가장 처음 수 x - (길이 - 1 / 2 )
            if(start < 0 || l > 100) {
                bw.write("-1");
                break;
            }

            // (처음 시작하는 수 + 끝나는 수) * 길이 / 2
            if (n == (start * 2 + l - 1) * l / 2) {
                for (int i = 0; i < l; i++) {
                    bw.write((start + i) + " ");
                }
                break;
            }
            l++;
        }

        bw.flush();
        bw.close();
    }
}