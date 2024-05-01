import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        // 중복 확인 필요없으므로 boolean 배열 필요 x
        arr = new int[m];
        
        dfs(0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
    // 깊이에 따라 탐색하며, 깊이가 m (수열의 길이)와 동일할 시, sb에 수열을 sb에 저장
    static void dfs(int depth) {

        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            // 수열의 depth 인덱스에 i 값을 할당
            arr[depth] = i;
            // 다음 깊이로 탐색
            dfs(depth + 1);
        }
    }
}