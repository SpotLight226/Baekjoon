import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
        int n = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

        long max = 0;
        long min = 0;
        long mid = 0;

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            // 가지고 있는 랜선의 최대 값을 저장
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // mid 가 0 이라면, 아래 식에서 0으로 나누는 것이 되기 때문에
        // 입력 받은 랜선에서 최대 길이 + 1을 max 로 한다
        max ++;

        while (min < max) {
            mid = (max + min) / 2; // 중간 값

            int count = 0;

            // 최초 중간 값으로 나눈 개수
            for (int i = 0 ;i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count < n) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        bw.write(String.valueOf(min - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
