import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); // 월
        int d = Integer.parseInt(st.nextToken()); // 일

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int n = 0; // 현재 날을 구하기 위한 변수

        // 월의 일 수를 해당 월 전까지 더해준다
        for (int i = 0; i < m; i++) {
            n += months[i];
        }

        n += d - 1; // 현재 일자
        bw.write(days[n % 7]); // 7 로 나누어 요일을 계산
        bw.flush();
        bw.close();
        br.close();

    }
}
