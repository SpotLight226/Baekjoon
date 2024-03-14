import java.io.*;
import java.util.*;

public class Main {
    static long[] pado = new long[101]; // n 범위는 100까지

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < 101; i++) {
            pado[i] = -1;
        }

        pado[0] = 0;
        pado[1] = 1;
        pado[2] = 1;
        pado[3] = 1;

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(padovan(n)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static long padovan(int n) {
        if (pado[n] == -1) {
            pado[n] = padovan(n - 2) + padovan(n - 3);
        }

        return pado[n];
    }

}
