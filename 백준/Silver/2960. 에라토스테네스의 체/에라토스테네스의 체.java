import java.io.*;
import java.util.*;

public class Main {

    static boolean[] prime;
    static int n,k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        prime = new boolean[n + 1];

        int answer = solution();
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int solution() {
        int answer = 0;
        int count = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if (!prime[j]) {
                    prime[j] = true;
                    k--;

                    if (k == 0) {
                        answer = j;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}