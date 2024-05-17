import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 총 공 개수

        char[] arr = br.readLine().toCharArray();

        int redCount = 0;
        int blueCount = 0;
        int count = 0;

        int answer = 500001; // n <= 500000 까지
        // 공 색깔별 개수
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                redCount++;
            } else {
                blueCount++;
            }
        }

        //1. R 을 왼 쪽으로 모을 때,
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'R') {
                count++;
            } else {
                break;
            }
        }
        answer = Math.min(answer, redCount - count);

        //2. R 를 오른 쪽으로 모을 때,
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 'R') {
                count++;
            } else {
                break;
            }
        }
        answer = Math.min(answer, redCount - count);

        // 3. B를 왼쪽으로
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'B') {
                count++;
            } else {
                break;
            }
        }
        answer = Math.min(answer, blueCount - count);

        // 4. B를 오른쪽으로
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 'B') {
                count++;
            } else {
                break;
            }
        }
        answer = Math.min(answer, blueCount - count);

        System.out.println(answer);
    }
}