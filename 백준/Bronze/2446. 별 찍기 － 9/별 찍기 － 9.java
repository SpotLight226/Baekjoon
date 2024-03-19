import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }

            for (int k = 0; k < (2 * n - 1) - (2 * i); k++) {
                sb.append("*");
            }
            sb.append("\n");

        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 1; j < (n - 1) - i; j++) {
                sb.append(" ");
            }

            for (int k = 0; k < 3 + 2 * i; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
