import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            // 각 테이스 케이스 당 배열을 넣어두기
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

           int max = 0; // 수열이 만들어 질 때 최대 값

            for (int j = 0; j < n; j++) {
                // +1 했을 때, arr의 배열과 다르다면 +1
                if (max + 1 != arr[j]) { 
                    max++;
                } else { // 아니라면 +2 해야함 
                    max += 2;
                }
            }

            sb.append(max).append("\n");
        }

        System.out.println(sb.toString());
    }
}