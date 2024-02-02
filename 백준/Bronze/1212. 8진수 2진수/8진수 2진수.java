import java.io.*;
import java.math.BigInteger;
import java.text.BreakIterator;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String octalNum = br.readLine();

        String binaryString = octalToBinary(octalNum);

        bw.write(binaryString);
        bw.flush();
        bw.close();
        br.close();
    }

    static String octalToBinary(String octalNum) {
        StringBuilder binary = new StringBuilder();

        // 첫 번째 숫자의 이진수 변환 후 앞의 0 제거
        int firstDigit = Character.getNumericValue(octalNum.charAt(0));
        String binaryDigit = Integer.toBinaryString(firstDigit);
        binary.append(binaryDigit);

        for (int i = 1; i < octalNum.length(); i++) {
            int decimalValue = Character.getNumericValue(octalNum.charAt(i));
            binaryDigit = Integer.toBinaryString(decimalValue);

            // 3비트로 만들기 위해 앞에 0 추가
            while (binaryDigit.length() < 3) {
                binaryDigit = "0" + binaryDigit;
            }

            binary.append(binaryDigit);
        }

        return binary.toString();
    }
}
