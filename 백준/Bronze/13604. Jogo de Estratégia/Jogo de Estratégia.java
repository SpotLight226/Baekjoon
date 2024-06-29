import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int j = Integer.parseInt(st.nextToken()); // 플레이어 수
        int r = Integer.parseInt(st.nextToken()); // 라운드 수

        int[] arr = new int[j * r];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < j * r; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] players = new int[j];

        for (int i = 0; i < j * r; i++) {
            players[i % j] += arr[i];
        }

        int maxScore = 0;
        int winner = 0;

        for (int i = 0; i < j; i++) {
            // 가장 큰 수를 가진 마지막 사람
            if (players[i] >= maxScore) {
                maxScore = players[i]; //최고 점수 갱신
                winner = i + 1; // 인덱스에 + 1
            }
        }

        System.out.println(winner);
    }
}