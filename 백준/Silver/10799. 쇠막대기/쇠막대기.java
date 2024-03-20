import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");

        Stack<String> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];

            // 레이저 가 나오려면 ( ) 가 되어야 한다
            // 스택에 넣어두기
            if (temp.equals("(")) {
                stack.push(temp);
            } else {
                // 만약 ( ( 이런 식이라면 레이저가 사이에 나온다는 뜻
                if (arr[i - 1].equals("(")) {
                    stack.pop();
                    answer += stack.size(); // 넣어둔 스택만큼 정답에 더하기
                } else {
                    // 아니라면 그냥 레이저 하나이므로 + 1
                    answer++;
                    stack.pop();
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
