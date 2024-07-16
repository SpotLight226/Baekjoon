import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long minSpeed = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (minSpeed <= arr[i]) {
                minSpeed = arr[i];
            } else if (minSpeed > arr[i]) {

                long div = minSpeed / arr[i];
                if (minSpeed % arr[i] != 0) {
                    div++;
                }
                minSpeed = arr[i] * div;
            }
        }

        System.out.println(minSpeed);
    }
}
