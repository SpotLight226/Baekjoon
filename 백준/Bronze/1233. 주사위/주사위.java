import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());

        int[] arr = new int[s1 + s2 + s3 - 2]; // 합의 모든 경우의 수

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i + j + k; // 주사위의 합
                    arr[sum - 3]++; // 해당 값의 빈도를 저장해야해서 -3 한다음 해당 인덱스의 값을 + 1
                }
            }
        }

        int max = 0; // 최대 빈도
        int answer = 0; // 해당 값

        for (int i = 0; i < arr.length; i++) {
            // 빈도가 최대 빈도보다 크다면
            if (max < arr[i]) {
                max = arr[i]; // 최대 빈도 업데이트
                answer = i + 3; // 저장할 때, 인덱스로 만들기 위해서 -3 햇으므로 다시 +3
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
