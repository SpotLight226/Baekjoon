import java.io.*;
import java.util.*;

public class Main {

    static long c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken()); // 제곱할 수
        long b = Long.parseLong(st.nextToken()); // 지수
        c = Long.parseLong(st.nextToken()); // 나눌 수

        bw.write(String.valueOf(solution(a, b)));
        bw.flush();
        bw.close();
        br.close();
    }

    // 제곱 연산은 지수를 나누어 계산 가능
    // 10, 11 일 때, 10^5 * 10^5 * 10
    // ((10^2 * 10^2) * 10) * ((10^2 * 10^2) * 10)) * 10
    // (((10 * 10) * (10 * 10)) * 10) * (((10 * 10) * (10 * 10)) * 10) * 10

    // 모듈러 연산
    // (a*b) % c = (a % c * b % c) % c
    static long solution(long i, long j) {

        // 지수가 1
        if (j == 1) {
            return i % c;
        }

        long temp = solution(i, j / 2); // 지수의 절반 a ^ j/2

        // 지수가 짝수 일 때,
        if (j % 2 == 0) {
            return temp * temp % c;
        } else { // 지수가 홀수 일 때
            // temp 가 long 범위를 넘어갈 수 있으므로, (temp * temp % c ) 로 변형한다
            return (temp * temp % c) * i % c;
        }

    }

}
