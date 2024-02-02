import java.io.*;
import java.util.*;

public class Main {

    static boolean[] prime = new boolean[100001]; // A,B 는 100000 보다 작거나 같다
    static int[] arr = new int[100001]; // 소수인 숫자가

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        checkPrime(); // 소수 판별 및 개수 구하기

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        br.close();

        int answer = 0;

        for (int i = A; i <= B; i++) {
            if (!prime[arr[i]]) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    static void checkPrime() {
        prime[0] = prime[1] = true; // 0, 1 은 소수 아님
        for (int i = 2; i < 100001; i++) {
            if(prime[i]) continue; // 이미 소수라면 건너 뛰기
            for (int j = i * 2 ; j < 100001; j += i) {
                prime[j] = true;
                int temp = j;
                while (temp % i == 0) {
                    temp /= i;
                    arr[j]++;
                }
            }
        }

    }
}
