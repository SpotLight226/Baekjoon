
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String s = br.readLine();

            if(s.contains("push")){
                st = new StringTokenizer(s);
                st.nextToken();
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (s.equals("pop")){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                } else {
                    System.out.println(-1);
                }
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if(s.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }



    }
}

