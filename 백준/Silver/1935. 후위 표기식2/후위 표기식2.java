import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 피연산자 개수 즉, 숫자
        char[] chars = br.readLine().toCharArray();

        Stack<Double> stack = new Stack<>();

        Double[] arr = new Double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c != '*' && c != '/' && c != '+' && c != '-') {
                stack.push(arr[c - 'A']);
            } else {
                Double n2 = Double.parseDouble(stack.pop().toString()); // 두번째 피연산자
                Double n1 = Double.parseDouble(stack.pop().toString()); // 첫번째 피연산자 

                switch (c) {
                    case '+':
                        stack.push(n1 + n2);
                        break;
                    case '-':
                        stack.push(n1 - n2);
                        break;
                    case '*':
                        stack.push(n1 * n2);
                        break;
                    case '/':
                        stack.push(n1 / n2);
                        break;
                }
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}