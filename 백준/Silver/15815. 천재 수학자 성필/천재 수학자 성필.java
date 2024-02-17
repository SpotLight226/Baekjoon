import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        char arr[] = br.readLine().toCharArray();
        br.close();

        for (int i = 0; i < arr.length; i++) {
            // 숫자일 시, stack 에 넣기
            if (arr[i] >= '0') {
                stack.push(arr[i] - '0');
            } else {
                // 기호라면
                int num1 = stack.pop();
                int num2 = stack.pop();

                switch (arr[i]) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num2 - num1);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num2 / num1);
                        break;
                }
            }
        }

        bw.write(String.valueOf(stack.pop()));
        bw.flush();
        bw.close();
    }
}
