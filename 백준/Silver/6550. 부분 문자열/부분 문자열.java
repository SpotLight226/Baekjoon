import java.io.*;
import java.util.*;

public class Main {

    static String str;
    static int index;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            index = 0;

            String s = st.nextToken();
            String t = st.nextToken();

            for (int i = 0; i < t.length(); i++) {
                if (s.charAt(index) == t.charAt(i)) {
                    index++;
                }
                if(index == s.length()) break;
            }

            if (index == s.length()) {
                sb.append("Yes").append("\n");
            } else {
                sb.append("No").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
