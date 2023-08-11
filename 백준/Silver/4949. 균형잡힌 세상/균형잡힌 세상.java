
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while (true) {
            str = br.readLine();

            if (str.equals(".")) {
                break;
            }
                System.out.println(sol(str));

        }
    }

    public static String sol(String str) {

        Stack<Character> stack = new Stack<>();

        String s = str.replaceAll("[a-zA-Z. ]", "");

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '[' || arr[i] == '(') {
                stack.push(arr[i]);
            } else if (arr[i] == ']'){

                if(stack.isEmpty() || stack.peek() != '['){
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (arr[i] == ')') {

                if(stack.isEmpty() || stack.peek() != '('){
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            return "yes";
        } else {
            return "no";
        }
    }
}

