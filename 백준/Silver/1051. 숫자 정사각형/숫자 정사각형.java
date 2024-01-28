import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Character.valueOf(ch[j]);
            }
        }

        // 정사각형의 최대 길이 = 직사각형 각 변의 길이인 n, m 중 작은 것
        int length = Math.min(n, m);
        
        // length 1까지 확인 
        while (length > 0) {
            
            for (int i = 0; i < n - length + 1; i++) {
                for (int j = 0; j < m - length + 1; j++) {
                    int temp = arr[i][j];
                    // 모든 꼭지점 : 오른쪽, 아래, 대각선 오른쪽
                    if (temp == arr[i + length - 1][j] && temp == arr[i][j + length - 1] && temp == arr[i + length - 1][j + length - 1]) {
                        System.out.println(length * length);
                        return;
                    }
                }
            }
            // 해당 크기에서 꼭지점이 동일한 정사각형이 없다는 것이므로 길이을 줄인다
            length--;
        }

        System.out.println(length);
    }
}