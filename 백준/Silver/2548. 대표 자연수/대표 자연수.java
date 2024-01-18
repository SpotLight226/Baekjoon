import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 자연수 개수

        int[] sum = new int[10001];
        int[] cnt = new int[10001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sum[temp] += temp;
            cnt[temp]++;
        }

        for (int i = 1; i <= 10000; i++) {
            // i까지의 누적합을 계산
            sum[i] += sum[i - 1];
            cnt[i] += cnt[i - 1];
        }

        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 1; i <= 10000; i++) {
            if(cnt[i] - cnt[i-1] == 0)  continue;

            int cal = (i * cnt[i - 1] - sum[i - 1]) + (sum[10000] - sum[i] - i * (cnt[10000] - cnt[i]));

            if (min > cal) {
                min = cal;
                answer = i;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}