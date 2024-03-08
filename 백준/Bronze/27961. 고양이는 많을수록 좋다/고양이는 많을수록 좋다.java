import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        int answer = 0;

        while (n > 3) {
            answer++;
            n = n / 2 + (n % 2 == 0 ? 0 : 1);
        }

        bw.write(String.valueOf(answer + n));
        bw.flush();
        bw.close();
        br.close();

    }

}
