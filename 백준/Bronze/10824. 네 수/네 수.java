import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long ab = Long.parseLong(st.nextToken() + st.nextToken());
        long cd = Long.parseLong(st.nextToken() + st.nextToken());

        bw.write(String.valueOf(ab + cd));
        bw.flush();
        bw.close();
        br.close();
    }
}