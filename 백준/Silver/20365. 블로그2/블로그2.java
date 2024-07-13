import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int bCnt = 0; // 파란색 그룹
        int rCnt = 0; // 빨간색 그룹
        char c = 'a';
        int n = Integer.parseInt(br.readLine()); // 문제 수
        String str = br.readLine(); // 입력

        for (int i = 0; i < n; i++) {
            char cur = str.charAt(i); // 현재 문자

            // 이전 문자와 현재의 문자가 다를 때는 칠하는 횟수가 증가한다
            if (cur != c) {
                if (cur == 'R') { // R 이라면 빨간색
                    rCnt++;
                } else { // B 라면 파란색
                    bCnt++;
                }
            }
            c = cur;
        }
        // 빨간색 그룹, 파란색 그룹의 색칠 횟수 중 작은 것을 고르고, 처음 색깔로 칠하는 1을 더한다
        System.out.println(Math.min(bCnt, rCnt) + 1);
    }
}
