import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 에라토스테네스의 체를 이용하여 N 이하의 소수를 구함
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 연속된 소수의 합으로 나타낼 수 있는 경우의 수 계산
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                int sum = 0;
                for (int j = i; j <= n; j++) {
                    if (isPrime[j]) {
                        sum += j;
                        if (sum == n) {
                            answer++;
                            break;
                        } else if (sum > n) {
                            break;
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}