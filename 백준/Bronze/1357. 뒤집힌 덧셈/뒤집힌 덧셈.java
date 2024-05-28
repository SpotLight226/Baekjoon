import java.io.*;
import java.util.*;

public class Main {
    static int Rev(int n) {
        int reverse = 0;
        while (n != 0) {
            int temp = n % 10; // 끝 자리
            reverse = reverse * 10 + temp; // 기존 revsere에 10을 곱해 자릿수를 높히고 끝자리 더하기
            n /= 10;
        }
        return reverse;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int revX = Rev(Integer.parseInt(st.nextToken()));
        int revY = Rev(Integer.parseInt(st.nextToken()));

        int answer = Rev(revX + revY);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    
}