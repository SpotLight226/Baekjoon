import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int now = 0; // 현재
        int start = 0; // 임무 시작
        int time = 0; // 계산 시간

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine(), ":");

            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            if (i == 0) {
                now = (h * 3600) + (m * 60) + s; // 현재 시간
            } else {
                start = (h * 3600) + (m * 60) + s; // 임무 시작 시간
            }
        }

        // 현재 시간이 임무 시작보다 크다면 24 시간에서 현재 - 시작시간
        if (now >= start) {
            time = (24 * 3600) - (now - start);
        // 현재 시간이 임무 시작보다 작다면 시작 - 현재
        } else {
            time = start - now;
        }
        // 시, 분 , 초 로 나누어 출력
        System.out.format("%02d:%02d:%02d", (time / 3600), ((time / 60) % 60), (time % 60));
    }
}
