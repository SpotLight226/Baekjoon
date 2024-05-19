import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 수의 개수
        int m = Integer.parseInt(st.nextToken()); // m 으로 나누어 떨어지는 수

        int sum = 0;
        int[] arr = new int[1001];
        long answer = 0;
        st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            int temp = Integer.parseInt(st.nextToken());
            sum += temp;
            sum %= m;
            answer += arr[sum];
            arr[sum]++;
            if(sum == 0) answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}