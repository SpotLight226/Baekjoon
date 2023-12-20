import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {

                case "push":
                    // offer 큐의 맨 뒤에 요소를 추가
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    /*
                     *  poll 가장 앞에 있는 요소를 삭제
                     *  삭제할 원소가 없을 경우 null을 반환
                     */
                    Integer item = queue.poll();
                    if(item == null) {
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(item + "\n");
                    }
                    break;

                case "size":
                    bw.write(queue.size() + "\n");
                    break;

                case "empty":
                    if(queue.isEmpty()) {
                        bw.write(1 + "\n");
                    }
                    else {
                        bw.write(0 + "\n");
                    }
                    break;

                case "front":
                    // peek() 큐에 꺼낼 요소가 없을 경우 null 반환
                    Integer temp = queue.peek();
                    if(temp == null) {
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(temp + "\n");
                    }
                    break;

                case "back":
                    // peekLast() 큐에 꺼낼 요소가 없을 경우 null 반환
                    Integer i = queue.peekLast();
                    if(i == null) {
                        bw.write(-1 + "\n");
                    }
                    else {
                        bw.write(i + "\n");
                    }
                    break;
            }
        }
        br.close();

        bw.flush();
        bw.close();

    }
}


