import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()); // 테스트 번호

            int[] arr = new int[20];

            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;

            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if(arr[j] < arr[k]) cnt++;
                }
            }

            sb.append(n + " " + cnt).append("\n");
        }

        System.out.println(sb.toString());
    }
}