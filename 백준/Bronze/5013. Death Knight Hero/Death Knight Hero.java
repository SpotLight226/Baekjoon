import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 싸움 수
        int answer = 0;

        while (n-- > 0) {
            String log = br.readLine();
            boolean won = true;

            for (int i = 0; i < log.length() - 1; i++) {
                // C 다음 D가 바로 나온다면 졌으므로 won을 false로 만들고 루프 종료
                if (log.charAt(i) == 'C' && log.charAt(i + 1) == 'D') {
                    won = false;
                    break;
                }
            }
            // 이겼다면 answer + 1
            if(won) answer++;
        }

        System.out.println(answer);
    }
}