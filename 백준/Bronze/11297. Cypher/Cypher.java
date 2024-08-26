import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str;

        while (!(str = br.readLine()).equals("0 0 0")) {
            st = new StringTokenizer(str);

            // S 게산
            int S = 0;
            for (int i = 0; i < 3; i++) {
                S += Integer.parseInt(st.nextToken());
            }
            S = (S % 25) + 1;

            char[] arr = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : arr) {
                if (c >= 'a' && c <= 'z') {
                    char temp = (char) (c - S);
                    if (temp < 'a') {
                        temp += 26; // 'a' 이전일 경우 + 26 해서 z로 되돌아간다
                    }
                    sb.append(temp); // S를 계산한 문자를 넣는다
                } else {
                    sb.append(c); // 알파벳이 아닌 문자의 경우 그대로 넣기
                }
            }

            bw.write(sb.toString()); // 버퍼라이터에 sb 넣기
            bw.newLine(); // 버퍼라이터 새 줄
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

