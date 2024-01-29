
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 참가자 수
        int a = Integer.parseInt(st.nextToken()); // 김지민
        int b = Integer.parseInt(st.nextToken()); // 임한수

        int answer = 0;

        while (a != b) {
            // 다음 라운드의 번호
            // 홀수 : 현재 번호 / 2 + 1
            // 짝수 : 현재 번호 / 2
            // 즉, 현재 번호 / 2 + 현재 번호를 2로 나눈 나머지를 더한다 ( 홀수 면 1, 짝수면 0)
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }

        System.out.println(answer);

    }
}