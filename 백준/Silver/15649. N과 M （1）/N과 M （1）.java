import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;
    static boolean[] check;
    static int n;
    static int m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 1 부터 n 까지 자연수
        m = Integer.parseInt(st.nextToken()); // m 개

        arr = new int[m];
        check = new boolean[n];

        dfs(0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int depth) {

        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}