
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append((int)Math.pow(2, n) - 1).append("\n");

        hanoi(n, 1, 2, 3);

        System.out.println(sb);

    }

    public static void hanoi(int n, int start, int mid, int end){
        if(n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }

        // 1. 위의 원판을 옮긴다
        hanoi(n -1, start, end, mid);

        // 2. 옮긴 것을 출력
        sb.append(start + " " + end + "\n");

        // 3. 밑의 원판 옮김
        hanoi(n-1, mid, start, end);
    }
}