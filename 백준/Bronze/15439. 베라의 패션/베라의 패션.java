import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 개수

        // 1 -> 0 , 2 -> 2 , 3 -> 6, 4 -> 12, 5 -> 20
        bw.write(String.valueOf(n * (n - 1)));
        bw.flush();
        bw.close();
        br.close();

    }
}