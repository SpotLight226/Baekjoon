import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        sb.append(A.add(B)).append("\n"); // 더하기
        sb.append(A.subtract(B)).append("\n"); // 빼기
        sb.append(A.multiply(B)); // 곱하기
        // divide 나누기
        // remainder 나머지

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}