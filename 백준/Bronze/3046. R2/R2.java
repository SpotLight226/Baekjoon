import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        // s = (r1 + r2 ) / 2
        // 2s = r1 + r2
        // 2s - r1 = r2
        bw.write(String.valueOf(2 * s - r1));
        bw.flush();
        bw.close();
        br.close();
    }
}
