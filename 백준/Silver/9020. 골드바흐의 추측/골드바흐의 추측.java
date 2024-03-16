import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static boolean[] arr = new boolean[10001]; // 제한이 10000까지

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        getPrime(); // 미리 소수 구해놓기

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());
            // 차이가 가장 작은 수 이므로 반 나누어서 찾기
            int firstPrime = n / 2;
            int secondPrime = n / 2;

            while (true) {
                // false 여야 소수 임
                // 소수 배열에서 둘 다 false 라면
                if (!arr[firstPrime] && !arr[secondPrime]) {
                    sb.append(firstPrime + " " + secondPrime).append("\n");
                    break;
                }
                // 아니라면 첫번째 값 -1
                // 두번째 값 +1
                firstPrime--;
                secondPrime++;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void getPrime() {
        arr[0] = arr[1] = true; // 0, 1 은 소수 아님
        // 에라토스테네스의 체
        // 제곱 근으로 판별해서 소수인지 판별
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            // 이미 판단한 숫자라면 continue
            if(arr[i]) continue;

            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }

    }
}
