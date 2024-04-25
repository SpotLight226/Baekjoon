import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[5];
        int num = 0;
        int score = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                arr[i] += Integer.parseInt(st.nextToken());
            }

            if (score < arr[i]) {
                num = i + 1;
                score = arr[i];
            }
        }

        bw.write(num + " " + score);
        bw.flush();
        bw.close();
        br.close();
    }
}