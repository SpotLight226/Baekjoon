import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        br.close();

        int answer = A.length(); // A가 B와 완전히 다르다고 가정한 answer

        // A와 B의 길이 차이 만큼 비교
        for (int i = 0; i < B.length() - A.length() + 1; i++) {
            int temp = 0; // 임시 값
            // A와 B를 전체 비교
            for (int j = 0; j < A.length(); j++) {
                // A 와 B의 문자가 다르다면 임시 값 + 1
                if (A.charAt(j) != B.charAt(j + i)) {
                    temp++;
                }
            }
            answer = Math.min(answer, temp);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
