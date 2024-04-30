import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static boolean[] check;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 1 ~ n 까지 자연수
        m = Integer.parseInt(st.nextToken()); // 자연수의 개수

        arr = new int[m]; // 자연수를 저장할 배열
        check = new boolean[n]; // n 까지 자연수 중복을 체크하기 위한 배열

        dfs(0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int depth) {
        if (depth == m) {
            if (checkAsc(arr)) {
                for (int i : arr) {
                    sb.append(i).append(' ');
                }
                sb.append("\n");
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                arr[depth] = i + 1;
                check[i] = true;
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }

    static boolean checkAsc(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if(arr[i -1] > arr[i]) return false;
        }
        return true;
    }
}