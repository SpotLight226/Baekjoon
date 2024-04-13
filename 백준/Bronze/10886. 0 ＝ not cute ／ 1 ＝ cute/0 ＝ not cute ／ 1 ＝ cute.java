import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int result = 0;

        while (n-- > 0) {
            int temp = Integer.parseInt(br.readLine());

            if (temp == 0) {
                result--;
            } else {
                result++;
            }
        }

        bw.write(result > 0 ? "Junhee is cute!" : "Junhee is not cute!");
        bw.flush();
        bw.close();
        br.close();
    }

}