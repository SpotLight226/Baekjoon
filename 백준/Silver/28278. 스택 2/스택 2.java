import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;


class Main {

    static LinkedList<Integer> stack = new LinkedList<>();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 명령 수

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("1")){
                stack.addFirst(Integer.parseInt(st.nextToken()));
            }else if(command.equals("2")){
                bw.write((stack.isEmpty() ? -1 : stack.pollFirst()) + "\n");
            }else if(command.equals("3")){
                bw.write(stack.size() + "\n");
            }else if(command.equals("4")){
                bw.write((stack.isEmpty() ? 1 : 0) + "\n");
            }else if(command.equals("5")){
                bw.write((stack.isEmpty()? -1 : stack.getFirst()) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}


