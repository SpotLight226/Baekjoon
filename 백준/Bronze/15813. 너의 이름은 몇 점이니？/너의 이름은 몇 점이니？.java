import java.io.*;
import java.util.*;

public class Main {

    static long c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += str.charAt(i) - 64;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }
}
