import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;

        for (int i = 0; i < 8; i++) {
            char[] arr = br.readLine().toCharArray();

            if (i % 2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    if (arr[j] == 'F') {
                        count++;
                    }
                }
            } else {
                for (int j = 1; j < 8; j += 2) {
                    if (arr[j] == 'F') {
                        count++;
                    }
                }
            }
        }

        br.close();

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}