import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if (distance == 0 && r1 == r2) {
                sb.append(-1);
            } else if (distance > Math.abs(r2 - r1) && distance < r1 + r2) {
                sb.append(2);
            } else if (Math.abs(r2 - r1) == distance || r2 + r1 == distance) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }
        
        br.close();
        
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}