import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로

        int answer = 0;

        // 이동 방법
//        2칸 위로, 1칸 오른쪽 // 1 (2,1)
//        1칸 위로, 2칸 오른쪽 // 2 (1,2)
//        1칸 아래로, 2칸 오른쪽 // 3 (-1,2)
//        2칸 아래로, 1칸 오른쪽 // 4 (-2,2)

        if(n == 1) answer = 1; // 세로가 1이라면 어디로도 이동 불가능 ( 시작만 가능 )
        if (n == 2) {
            // 세로가 2라면 이동 방법은 2,3 번 2개 => (가로 +1) / 2
            // 4가지 방법을 다 사용 안한다면 최대 이동횟수 => 3 + 1(시작)
            answer = Math.min(4, (m + 1) / 2);
        }
        // 세로가 3보다 같거나 크다면
        if (n >= 3) {
            // 가로가 7보다 커야만, 
            if (m >= 7) {
                answer = m - 2;
            } else {
                answer = Math.min(4, m);
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
