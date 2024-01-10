import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine()); // 테스트 개수

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int answer = 1; // 처음
            
            // 문제 수의 1의 자리만 보면된다, 컴퓨터 개수는 10개
            // 1 의 자리를 기준으로 계산한다
            for (int i = 1; i <= b; i++) {
                answer = answer * a % 10;
            }

            if (answer == 0) {
                answer = 10;
            }

            bw.write(answer + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}





