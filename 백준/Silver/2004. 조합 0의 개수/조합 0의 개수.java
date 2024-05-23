import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long fiveCount = five(n) - five(n - m) - five(m);
        long twoCount = two(n) - two(n - m) - two(m);

        System.out.println(Math.min(fiveCount, twoCount));
    }

    static long five(long n) {
        long count = 0;

        while (n >= 5) {
            count += (n / 5);
            n /= 5;
        }

        return count;
    }

    static long two(long n) {
        long count = 0;

        while (n >= 2) {
            count += (n / 2);
            n /= 2;
        }

        return count;
    }
}