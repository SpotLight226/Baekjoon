import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean odd = false;

        // 문어가 사전 순으로 제일 앞서는 수열을 만드려면
        // 그림처럼 1 2 1 2 처럼 잡는 것
        // 문어 숫자가 홀 수 라면, 한 바퀴 돌 때, 문어 한 마리가 남으므로
        // 1 2 로 이루어진 수열을 만들기 위해 일단 한 마리 뺀다
        // 짝 수라면 그냥 while 문으로 들어가기
        
        if (n % 2 == 1) {
            odd =true;
            n --;
        }

        while (n-- > 0) {

            if (n % 2 == 1) {
                sb.append("1").append(" ");
            } else {
                sb.append("2").append(" ");
            }
        }
        
        // 마지막 한 마리 추가
        if (odd) {
            sb.append("3");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}
