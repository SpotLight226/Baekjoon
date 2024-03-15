import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 곡 개수
        int i = Integer.parseInt(st.nextToken()); // 평균

        // 적어도 몇 곡이 저작권이 있는지 물어봤으므로,
        // i 가 올림 되었다고 가정 (-1 하기)
        // 저작권이 있는 멜로디도 소수가 나올 수 있으니 올림 ( + 1 하기 )

        bw.write(String.valueOf(a * (i - 1) + 1));
        bw.flush();
        bw.close();
        br.close();

    }

}
