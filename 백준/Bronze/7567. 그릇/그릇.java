import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();

        int answer = 10;
        for (int i = 1; i < arr.length; i++) {
            char c = arr[i];
            if (c == arr[i - 1]) {
                answer += 5;
            } else {
                answer += 10;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}