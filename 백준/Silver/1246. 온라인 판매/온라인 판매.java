import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 달걀
        int m = Integer.parseInt(st.nextToken()); // 사람
        int max = 0;
        int p = 0;

        int[] arr = new int[m];
        int[] sum = new int[m];

        // 가격 입력
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr); // 가격 정렬 
        
        // 계란은 한 사람당 한 개씩만 판매 가능
        for (int i = 0; i < m; i++) {
            if (m > n) { // 사람이 달걀보다 많음
                if (i < m - n + 1) { // 달걀 모두 판매
                    sum[i] = arr[i] * n; // 판매가격 넣기
                } else { // 달걀 일부만 판매
                    sum[i] = arr[i] * (m - i);
                }
            } else { // 달걀이 사람보다 많음
                sum[i] = arr[i] * (m - i);
            }
        }

        max = sum[0]; // 임시 최대
        for (int i = 1; i < m; i++) {
            if (sum[i] > max) { // 최대 판매 가격이 높다면
                max = sum[i]; // 최대 판매액 업데이트
                p = i; // 판매 가격 인덱스
            }
        }

        bw.write(String.valueOf(arr[p]) + " " + String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
