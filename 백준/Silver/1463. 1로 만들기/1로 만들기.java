import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = solution(n, 0);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }

    static int solution(int n, int count) {
        if (n < 2) {
            return count;
        }

        return Math.min(solution(n / 2, count + 1 + (n % 2)), solution(n / 3, count + 1 + (n % 3)));
    }
}
