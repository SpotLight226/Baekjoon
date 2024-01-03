import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<String> leftStack = new Stack<String>();
        Stack<String> rightStack = new Stack<String>();

        String[] arr = str.split(""); // 한 개씩 나누어 스택에 넣는다
        for(String s : arr) {
            leftStack.push(s);
        }

        while(m-->0) {
            String command = br.readLine();
            char c = command.charAt(0); // 명령

            switch(c) {
                case 'L':
                    if(!leftStack.isEmpty()) // 비어 있지 않다면
                        rightStack.push(leftStack.pop()); // 왼 쪽에서 하나 빼서 오른쪽에

                    break;
                case 'D':
                    if(!rightStack.isEmpty()) // 오른 쪽이 비어잇지 않다면
                        leftStack.push(rightStack.pop()); // 오른 쪽에서 빼서 왼쪽으로

                    break;
                case 'B':
                    if(!leftStack.isEmpty()) { // 왼쪽이 비어있지 않다면
                        leftStack.pop(); // pop 해서 삭제
                    }
                    break;
                case 'P':
                    char t = command.charAt(2); // 들어갈 문자
                    leftStack.push(String.valueOf(t)); // 왼쪽에 넣기

                    break;
                default:
                    break;
            }
        }

        //Stack 은 LIFO
        //왼쪽 스택에 있는 문자를 오른쪽으로 옮긴 뒤에 오른쪽에 있는 모든 내용을 출력
        while(!leftStack.isEmpty())
            rightStack.push(leftStack.pop());

        while(!rightStack.isEmpty())
            bw.write(rightStack.pop());

        bw.flush();
        bw.close();
    }
}




