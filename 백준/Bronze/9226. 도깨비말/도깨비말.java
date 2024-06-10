import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if(str.equals("#")) break;

            int idx = 0;

            for (int i = 0; i < str.length(); i++) {

                if (i == 0 && check(str.charAt(i))) break;

                if (check(str.charAt(i))) {
                    idx = i;
                    break;
                }
            }

            if (idx == 0) {
                sb.append(str).append("ay\n");
            } else {
                sb.append(str, idx, str.length());
                sb.append(str, 0, idx).append("ay\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}