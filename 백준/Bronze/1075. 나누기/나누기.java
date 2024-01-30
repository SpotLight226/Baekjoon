import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        // n의 끝자리 2개를 00으로 만든다
        n /= 100; // 100으로 나누고
        n *= 100; // 100을 곱하면 뒤 2자리가 00이 된다
        int f = Integer.parseInt(br.readLine());
        br.close();

        int answer = 0;
        while (n % f != 0) {
            n++;
            answer++;
        }

        if (answer < 10) {
            bw.write("0" + answer);
        } else {
            bw.write(String.valueOf(answer));
        }

        bw.flush();
        bw.close();
    }
}