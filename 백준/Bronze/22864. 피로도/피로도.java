import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); //  피로도
        int b = Integer.parseInt(st.nextToken()); // 하는 일
        int c = Integer.parseInt(st.nextToken()); // 피로도 감소
        int m = Integer.parseInt(st.nextToken()); // 피로도 최대

        int answer = 0; // 일 총합
        int aSum = 0; // 픽로도 합

        int temp = 24;
        while (temp-- > 0) {
            // 피로도 총합에 일 했을 때의 a 를 더했을 때  m 보다 작거나 같을 때만
            if (aSum + a <= m) {
                answer += b; // 일 하고
                aSum += a; // 피로도 더하기
            } else {
                // 피로도가 초과되려 할 때, 쉬기
                aSum -= c; // 쉬기
                if (aSum < 0) { // 음수 라면 0으로 초기화
                    aSum = 0;
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
