import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String octalNum = br.readLine();

        BigInteger decimalNum = new BigInteger(octalNum, 8);

        String binaryString = decimalNum.toString(2);

        bw.write(binaryString);
        bw.flush();
        bw.close();
        br.close();
    }
}
