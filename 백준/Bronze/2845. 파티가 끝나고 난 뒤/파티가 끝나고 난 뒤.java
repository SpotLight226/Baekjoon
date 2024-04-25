import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken()); // 1m^2 당 사람 수
        int p = Integer.parseInt(st.nextToken()); // 파티장 넓이

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            sb.append(arr[i] - (l* p) + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}