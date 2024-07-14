import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 기억 문자 길이
        int m = Integer.parseInt(st.nextToken()); // 포스트잇 개수

        char[] know = br.readLine().toCharArray(); // 알고 있는 문자

        for (int i = 0; i < m; i++) {

            char[] post = br.readLine().toCharArray();

            int idx = 0; // 알고 있는 문자의 인덱스
            boolean check = false; // 알고 있는 문자가 있는지 확인

            for (int j = 0; j < post.length; j++) {
                // 알고 있는 문자와 포스트잇에 적혀있는 문자가 같다면
                if (know[idx] == post[j]) {
                    idx++; // 다음 알고 있는 문자로
                }

                // 알고 있는 문자의 인덱스 + 1 과 알고 있는 문자의 길이가 같다면
                // 비밃번호일 가능성 있음
                if (n == idx) {
                    check = true;
                    break;
                }
            }
            
            if (check) {
                sb.append("true").append("\n");
            } else {
                sb.append("false").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
