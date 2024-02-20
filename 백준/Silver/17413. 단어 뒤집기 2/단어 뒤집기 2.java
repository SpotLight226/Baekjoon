import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        // < , > 판별, false 라면, < . > 사이에 있다는 것, true 라면 일반 문자
        boolean check = false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            // < 일 시, stack 이 빌 때까지 pop
            if (str.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                check = true;
                // > 일 시, sb 에 넣기
            } else if (str.charAt(i) == '>') {
                check = false;
                sb.append(str.charAt(i));
                continue;
            }

            // < , > 사이에 있다는 뜻으로, sb에 > 가 나와서 check 가 false 로 변경 되기 전까지 sb에 넣는다
            if (check == true) {
                sb.append(str.charAt(i));
                continue;
                // 일반 적인 문자라면
            } else if (check == false) {

                // 공백일 시, stack 에 있던 모든 문자 넣고, 뒤에 공백을 추가
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                    // 일반 문자라면 sb에 넣기
                } else {
                    stack.push(str.charAt(i));
                }
            }

            // 마지막 문자일 시, stack 의 모든 문자 sb에 넣기
            if (i == str.length() - 1) {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
