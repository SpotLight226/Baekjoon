import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> location = new Stack<>();

        int n = Integer.parseInt(br.readLine()); // 탑 개수

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 탑이 1 부터 시작
        for (int i = 1; i <= n; i++) {
            int high = Integer.parseInt(st.nextToken()); // 탑의 높이
            while (true) {
                // 스택에 탑이 들어있을 때
                if (!stack.empty()) {
                        int forward = stack.peek(); // 앞에 있는 탑의 높이
                    // 앞의 탑 높이가 더 높다면
                        if (forward > high) {
                            // 탑의 위치를 보고 ( 스택에서 꺼내지 않음 ) sb에 넣기
                            sb.append(location.peek()).append(" ");
                            stack.push(high); // 높이 넣기 ( 혹시 뒤의 탑의 높이가 현재 탑보다 낮을 수도 있으니 넣기 )
                            location.push(i); // 탑의 위치 넣기
                            break;
                        } else { // 앞의 탑이 현재 탑보다 낮다면 현재 탑으로 가려진다
                            // // 들어가 있는 거 빼기
                            stack.pop();
                            location.pop();
                        }
                    } else { // 스택에 탑이 없다면, 수신할 수 없는 탑이 없다는 뜻이
                        sb.append(0).append(" ");
                        stack.push(high); // 현재 탑 높이 넣기
                        location.push(i); // 현재 탑 위치 넣기
                        break;
                    }
                }
            }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
