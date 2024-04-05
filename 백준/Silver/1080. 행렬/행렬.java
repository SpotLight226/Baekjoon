import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 가로
        int m = Integer.parseInt(st.nextToken()); // 세로

        int[][] arr = new int[n][m];
        int[][] target = new int[n][m];

        // 입력 행렬
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(in[j]);
            }
        }

        // 정답 행렬
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                target[i][j] = Integer.parseInt(in[j]);
            }
        }

        int answer = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                if (arr[i][j] == target[i][j]) continue;

                for (int k = i; k < i + 3; k++) {
                    for (int h = j; h < j + 3; h++) {
                        if (arr[k][h] == 1) {
                            arr[k][h] = 0;
                        } else {
                            arr[k][h] = 1;
                        }
                    }
                }
                answer++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != target[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(answer);
    }
}