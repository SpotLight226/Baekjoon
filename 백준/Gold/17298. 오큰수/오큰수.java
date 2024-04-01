import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        // 2개의 배열 이용
        // 하나는 입력받을 배열, 하나는 결과를 저장할 배열
        int[] arr = new int[n];
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력 받을 배열에는 입력값을 결과 배열에는 -1 을 미리 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            res[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고, 스택 안, 인덱스의 숫자가 i 인덱스의 숫자보다 작을 때
            // 결과 배열에 해당 i 인덱스의 값으로 변경
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                res[stack.pop()] = arr[i];
            }
            // 인덱스를 넣는다
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            sb.append(res[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
