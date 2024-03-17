import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static boolean[] arr = new boolean[10001]; // 제한이 10000까지

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
            for (int j = 1; j * j <= i; j++) {
                if (arr[i] > arr[i - j * j] + 1) {
                    arr[i] = arr[i - j * j] + 1;
                }
            }
        }

        System.out.println(arr[n]);
    }
}
