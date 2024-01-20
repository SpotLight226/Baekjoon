import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 총사원

            int[][] arr = new int[n][2]; // 사원들의 점수를 저장할 배열

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, (o1, o2) -> Integer.compare(o1[0], o2[0]));

            int top = arr[0][1]; // 서류 1등의 면접 점수
            int cnt = 0;
            for (int j = 1; j < n; j++) {
                // 서류 등수가 더 높은 지원자보다 면접 등수가 낮으면 탈락
                if (top < arr[j][1]) {
                    cnt++;
                    continue;
                }
                top = arr[j][1]; // 탈락안된 면접자의 면접점수
            }
            sb.append(n - cnt).append("\n"); // 총 인원 - 탈락자 수 
        }
        System.out.println(sb);
    }
}