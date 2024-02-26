import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int answer = 0;
        
        // n 을 2진수로 변환했을 때, 1의 개수가 k보다 작아질 때까지 반복
        /*
        1. n = 13 (이진수: 1101)
           k = 2
           answer = 0

        2.  Integer.bitCount(13) = 3 > 2 이므로 while 루프에 진입
            현재 물병의 이진수 표현에서 가장 작은 용량을 가진 물병은 1 그러므로 n & (-n)을 계산하면 1이 된다.
            // n & (-n) = 13 & (-13) = 0001
            따라서 answer에는 1이 누적
            answer += n & (-n) = 0 + 1 = 1
            n에는 물을 옮긴 물병의 양을 더하여 업데이트
            n += n & (-n) = 13 + 1 = 14

            Integer.bitCount(14) = 3 > 2 이므로 while 루프에 다시 진입
            현재 물병의 이진수 표현에서 가장 작은 용량을 가진 물병은 2, 그러므로 n & (-n)을 계산하면 2
            // n & (-n) = 14 & (-14) = 0010
            따라서 answer에는 2가 누적
            answer += n & (-n) = 1 + 2 = 3
            이제 n에는 물을 옮긴 물병의 양을 더하여 업데이트
            n += n & (-n) = 14 + 2 = 16

            Integer.bitCount(16) = 1 <= 2 이므로 while 루프를 탈출
        */
        
        while (Integer.bitCount(n) > k) {
            answer += n & (-n); // 물을 옮기는 과정에서 부어진 물의 양을 누적하여 저장
            n += n & (-n); // 현재 물병의 개수를 업데이트
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
