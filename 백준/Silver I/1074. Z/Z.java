import java.io.*;
import java.util.*;

public class Main {

    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 행렬 사이즈는 2^n * 2^n
        solution((int) Math.pow(2, n), r, c);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static void solution(int size, int r, int c) {

        if (size == 1) return; // 해당 분면에 있다면 끝

        if (r < size / 2 && c < size / 2) { // 왼 쪽 위에 있을 때
            solution(size / 2, r, c);
        } else if (r < size / 2 && size / 2 <= c) { // 오른 쪽 위에 있을 때
            answer += size * size /4;
            solution(size / 2, r, c - size / 2);
        } else if (size / 2 <= r && c < size / 2) { // 왼쪽 아래에 있을 때
            answer += (size * size / 4) * 2;
            solution(size / 2, r - size / 2, c);
        } else { // 오른쪽 아래에 있을 때
            answer += (size * size / 4) * 3;
            solution(size / 2, r - size / 2, c - size / 2);
        }
    }
}
