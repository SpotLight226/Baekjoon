import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int answer = 0;

        // 삼각형의 조건
        // a, b, c 세 변이 잇을 때, a + b > c 여야만 삼각형이 된다
        // a 변이 n의 3 분 1 일 때까지만 가능
        for (int a = 1; a <= n / 3; a++) {
            // b 는 a 부터 b가 가장 커지는 (n - a) /2 까지
            for (int b = a; b <= (n - a) / 2; b++) {
                int c = n - a - b; // c는 a 와 b 를 n에서 뺀 값
                if(b > c) break; // b가 c 보다 크면 삼각형 X

                if(a+b > c) answer++; // a + b 가 c 보다 크다면 삼각형
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}





