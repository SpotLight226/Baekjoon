import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine()); // 문자 길이

        String str = br.readLine();

        BigInteger answer = new BigInteger("0");

        for (int i = 0; i < l; i++) {
            // 아스키 코드로 a = 97 이므로 1 로 만드려면 - 96 한다
            // 알파벳 - 96 에 31 ^ i 를 곱한뒤 answer 에 더한다
            answer = answer.add(BigInteger.valueOf(str.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
        }
        
        // M 으로 나눈 값을 bw 에 write
        bw.write(String.valueOf(answer.remainder(BigInteger.valueOf(1234567891))));
        bw.flush();
        bw.close();
        br.close();
    }

}
