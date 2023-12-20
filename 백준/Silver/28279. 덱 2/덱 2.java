import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken()); // 명령

            switch (command) {
                case 1 : dq.addFirst(Integer.parseInt(st.nextToken())); break;
                case 2 : dq.addLast(Integer.parseInt(st.nextToken())); break;
                case 3 : bw.write((!dq.isEmpty() ? dq.removeFirst() : -1)+"\n"); break;
                case 4 : bw.write((!dq.isEmpty() ? dq.removeLast() : -1) + "\n"); break;
                case 5 : bw.write(dq.size() + "\n"); break;
                case 6 : bw.write((dq.isEmpty() ? 1 : 0) + "\n"); break;
                case 7 : bw.write((!dq.isEmpty() ? dq.getFirst() : -1) + "\n"); break;
                case 8 : bw.write((!dq.isEmpty() ? dq.getLast() : -1) + "\n"); break;
            }
        }

        br.close();

        bw.flush();
        bw.close();

    }
}


