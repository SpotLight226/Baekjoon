import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(br.readLine());

        sb.append((r * r * Math.PI)).append("\n");
        sb.append((r * r * 2));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
