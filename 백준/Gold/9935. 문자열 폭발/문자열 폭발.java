import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i)); // stack 에 입력 문장 을 하나씩 나누어 문자별 입력

            // stack 의 길이가 bomb 의 길이와 같아지면
            if (stack.size() >= bomb.length()) {

                boolean check = true; // 폭탄이 있는지 확인

                // 스택에 들어가 있는 문장 길이 ~ 스택 문장 길이 - 폭탄 길이 만큼 탐색
                for (int j = 0; j < bomb.length(); j++) {

                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }

        for (Character c : stack) {
            sb.append(c);
        }

        bw.write(sb.length() == 0 ? "FRULA" : sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}