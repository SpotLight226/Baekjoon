import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder S = new StringBuilder(br.readLine());
        StringBuilder T = new StringBuilder(br.readLine());

        // S의 길이가 T 보다 작을 때까지 => 길이가 같아질 때까지
        while (S.length() < T.length()) {
            // T의 마지막 글자가 A 라면, 맨 뒤의 글자를 뺀다 ( 1번 규칙: 맨 뒤에 A를 추가)
            if (T.charAt(T.length() - 1) == 'A') {
                T.deleteCharAt(T.length() - 1);
            }
            // T 의 마지막 글자가 B라면, 맨 뒤의 글자를 빼고, 뒤집는다 ( 2번 규칙 : 문자열을 뒤집고 B를 추가 )
            else if (T.charAt(T.length() - 1) == 'B') {
                T.deleteCharAt(T.length() - 1);
                T.reverse();
            }
        }

        bw.write(T.toString().contentEquals(S.toString()) ? "1" : "0");
        bw.flush();
        bw.close();
        br.close();
    }
}