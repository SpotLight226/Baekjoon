import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(Fibonacci(n)));
        bw.flush();
        bw.close();
        br.close();
    }

    static BigInteger Fibonacci(int n) {
        BigInteger prevPrev = BigInteger.valueOf(1);
        BigInteger prev = BigInteger.valueOf(1);

        BigInteger temp;

        for (int i = 2; i <= n; i++) {
            temp = prevPrev.add(prev);
            prevPrev = prev;
            prev = temp;
        }

        return prevPrev;
    }

}
