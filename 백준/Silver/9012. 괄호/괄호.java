
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t --> 0){
            String str = br.readLine();
            boolean check = true;
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '('){
                    stack.push('(');
                } else {
                    if(stack.size() == 0){
                        check = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(check && stack.size() == 0){
                sb.append("YES\n");
            } else if(!check || stack.size() != 0){
                sb.append("NO\n");
            }
        }
        br.close();
        System.out.println(sb.toString());
    }
}


