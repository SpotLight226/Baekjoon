import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        String str;

        while ((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);

            sb = new StringBuilder();
            sb.append("-".repeat(Math.max(0, (int) Math.pow(3, n))));

            kanto(sb, 0, (int) Math.pow(3, n));

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void kanto(StringBuilder sb, int start, int end) {
        if (end - start != 1) {
            int prev = (end - start) / 3;
            int next = (end - start) / 3 * 2;
            for (int i = start + prev; i < start + next; i++) {
                sb.setCharAt(i, ' ');
            }

            kanto(sb, start, start + prev);
            kanto(sb, start + next, end);
        }
    }
}