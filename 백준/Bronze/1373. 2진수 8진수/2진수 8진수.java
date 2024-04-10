import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 주어지는 수의 길이는 1,000,000을 넘지 않는다. >> int 형의 범위를 넘어간다
        // BigInteger 개체를 생성할 떄, 2 를 넣으면 10진수로 변환
        BigInteger decimalN = new BigInteger(br.readLine(), 2);

        // bigInteger 10진수 형태를 8진수로 변환
        String answer = decimalN.toString(8);

        bw.write(answer);
        bw.flush();
        bw.close();
        br.close();

    }

}