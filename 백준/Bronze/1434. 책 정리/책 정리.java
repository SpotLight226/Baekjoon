import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] box = new int[n];
        int[] book = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            book[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int a = 0;
        int b = 0;

        while (true) {
            if(b == book.length) break; // 모든 책 다 했으면 끝

            int temp = box[a] - book[b]; // 박스에서 책 크기를 뺀 값
            // 박스 크기가 책 크기보다 크다면
            if (temp >= 0) {
                box[a] = temp; // 박스의 남은 용량으로 업데이트
                b++; // 다음 책으로
            } else {
                a++; // 다음 박스로 이동
            }
        }

        // 모든 남은 용량을 더한다
        for (int i : box) {
            answer += i;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
