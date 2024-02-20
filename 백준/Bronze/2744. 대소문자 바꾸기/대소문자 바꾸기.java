import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            // 대문자 아스키코드 범위
            if (65 <= arr[i] && arr[i] <= 90) {
                arr[i] += 32;
            } else {
                arr[i] -= 32;
            }
        }

        for (char c : arr) {
            sb.append(c);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
