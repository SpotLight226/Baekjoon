import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            Deque<Integer> deque = new ArrayDeque<>();
            boolean isError = false;

            for (int i = 0; i < n; i++) {
                deque.add(Integer.parseInt(st.nextToken()));
            }

            boolean isReverse = false;
            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    isReverse = !isReverse;
                } else if (c == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReverse) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                StringBuilder result = new StringBuilder("[");
                if (!deque.isEmpty()) {
                    if (isReverse) {
                        while (deque.size() > 1) {
                            result.append(deque.pollLast()).append(",");
                        }
                        result.append(deque.pollLast());
                    } else {
                        while (deque.size() > 1) {
                            result.append(deque.pollFirst()).append(",");
                        }
                        result.append(deque.pollFirst());
                    }
                }
                result.append("]");
                System.out.println(result);
            }
        }
    }
}
