import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            // c 문자가 알파벳이 아니라면 sb에 그대로 넣기
            if (!Character.isLetter(c)) {
                sb.append(c);
                continue;
            }

            int n = (int)c + 13; // 유니코드

            // 이전 문자가 대문자면서 대문자 유니코드 범위를 넘어간다면
            if (Character.isUpperCase(c) && n > 90) {
                n -= 26;
            }
            // 이전 문자가 소문자면서 소문자 유니코드 범위를 넘어간다면
            if (Character.isLowerCase(c) && n > 122) {
                n -= 26;
            }
            sb.append((char) n);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
