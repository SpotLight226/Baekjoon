import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 물 새는 곳 개수
        int l = Integer.parseInt(st.nextToken()); // 테이프 길이

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        Arrays.sort(arr); // 오름 차순 정렬

        int count = 1; // 처음은 한 번 쓰니 1

        double place = arr[0] - 0.5; //첫 번째 위치

        for (int i = 0; i < n; i++) {
            // 첫 번째 위치 + 테이프 길이보다 배열의 다음 요소가 더 크다면
            if (place + l < arr[i]) {
                count++; // 개수 + 1
                place = arr[i] - 0.5; // 다음 위치를 설정
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}