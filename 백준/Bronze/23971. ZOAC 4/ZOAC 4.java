import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        br.close();
        
        int r = (h - 1) / (n + 1) + 1; // 행 계산
        int v = (w - 1) / (m + 1) + 1; // 열 계산

        bw.write(String.valueOf(r * v));
        bw.flush();
        bw.close();
    }
}