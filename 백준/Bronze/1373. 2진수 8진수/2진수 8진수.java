import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger decimalN = new BigInteger(br.readLine(), 2);

        String answer = decimalN.toString(8);

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();

    }

}