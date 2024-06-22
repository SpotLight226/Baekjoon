import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        int target = (int) ((y * 100) / x);

        if (target >= 99) {
            System.out.println(-1);
            return;
        }

        int answer = -1;
        int left = 0;
        int right = 1000000000;

        while (left <= right) {
            int mid = (left + right) / 2;
            int z = (int) (((y + mid) * 100) / (x + mid));

            if (target >= z) {
                answer = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}