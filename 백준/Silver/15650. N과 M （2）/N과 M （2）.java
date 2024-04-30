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

        n = Integer.parseInt(st.nextToken()); // 1 ~ n 까지 자연수
        m = Integer.parseInt(st.nextToken()); // 자연수의 개수

        arr = new int[m]; // 자연수를 저장할 배열

        // 오름차순인지를 파악하는 함수를 작성하는 것이 아닌, 현재 위치를 표시하는 인자를 넘겨주어 오름차순으로만 진행하게
        // 만드는 풀이 방식
        // 이게 더 쉬운 듯, 중복 확인하는 boolean 배열이 필요 없다
        dfs(1, 0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    // now => 현재 위치 -> 어디서 부터 시작하는지를 의미하는 변수
    static void dfs(int now, int depth) {
        // 어차피 depth 가 m 에 도달하지 않으면, sb 에 수열을 저장할 필요도 없다
        if (depth == m) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append("\n");
            return;
        }
        // 현재 i 값을 arr 에 저장하므로, 다음 재귀 호출에는 +1 한 값을 넘겨주어 호출한다
        for (int i = now; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}