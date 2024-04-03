import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        String str = "";

        while (st.hasMoreTokens()) {
            str += st.nextToken().charAt(0);
        }

        bw.write(str);
        bw.flush();
        bw.close();
        br.close();

    }
}