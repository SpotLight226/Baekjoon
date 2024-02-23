import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] bike = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bike[i] = Integer.parseInt(st.nextToken());
        }

        int[] current = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            current[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int temp = bike[i] - current[i];
            if (temp > 0) {
                answer += Math.abs(temp);
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
