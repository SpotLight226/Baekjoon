import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input;

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        
        // 스택을 2개 만들어서< > - 에 대한 스택 입력을 나누어 수행한다
        // 문제를 잘 읽어야 할 듯
        
        while (t-- > 0) {
            Stack<String> left = new Stack<>();
            Stack<String> right = new Stack<>();

            input = br.readLine().split("");

            for (String str : input) {
                // 각 조건에따라 2개의 스택에 넣는다
                switch (str) {
                    case "<":
                        if (!left.isEmpty()) {
                            right.push(left.pop()); // 왼쪽에서 빼서 오른쪽에
                        }
                        break;
                    case ">":
                        if (!right.isEmpty()) {
                            left.push(right.pop()); // 오른쪽에서 빼서 왼쪽에
                        }
                        break;
                    case "-":
                        if (!left.isEmpty()) {
                            left.pop(); // 왼쪽 에서 지우기
                        }
                        break;
                    default:
                        left.push(str);
                }
            }

            while (!left.isEmpty()) {
                right.push(left.pop());
            }

            while (!right.isEmpty()) {
                sb.append(right.pop());
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
