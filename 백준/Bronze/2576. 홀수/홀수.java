import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {

            int n = Integer.parseInt(br.readLine());

            if (n % 2 == 1) {
                if(n < min) min = n;
                answer += n;
            }
        }

        if (answer != 0) {
            bw.write(String.valueOf(answer));
            bw.newLine();
            bw.write(String.valueOf(min));
        } else {
            bw.write(String.valueOf(-1));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
