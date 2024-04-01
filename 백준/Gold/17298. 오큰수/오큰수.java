import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>(); // 수열의 인덱스를 넣을 스택
        int[] arr = new int[n]; // 숫자 수열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {

            // 스택에 각 숫자의 인덱스(i)를 넣고, 다음 숫자가 이 숫자보다 클 때까지 배열을 확인한다
            // [3 5 2 7]
            // 3 을 스택에 넣고 ( stack = 0 ), i = 0
            // 5 >> i = 1 , 스택이 비어있지 않고(stack = 0 ), arr[0] < arr[1] 이므로 arr[0] 을 arr[1] 값으로 변경
            //      stack 에 1을 넣는다 ( stack = 1)
            // 2 >> i = 2, 스택은 비어있지 않지만, arr[1] > arr[2] 이므로 while 은 넘어가고, 스택에 2 를 넣는다
            //      stack = 1, 2
            // 7 >> i = 3, 스택은 비어있지 않고, arr[1] < arr[3] , arr[2] < arr[3] 이므로
            //      arr[1], arr[2] = arr[3] 으로 변경, stack 에 3 을 넣는다
            // 모든 수열 확인 했으므로 반복 종료
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // 스택에 남아 있다는 뜻은 해당 인덱스의 숫자보다 큰 숫자가 없다는 뜻이므로, -1 로 값 변경
        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }
        // 출력
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
