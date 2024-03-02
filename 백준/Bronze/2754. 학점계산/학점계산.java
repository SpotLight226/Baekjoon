import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        br.close();

        double answer = 0;

        switch (arr[0]) {
            case 'A':
                answer = 4;
                break;
            case 'B':
                answer = 3;
                break;
            case 'C':
                answer = 2;
                break;
            case 'D':
                answer = 1;
                break;
            default:
                bw.write(String.valueOf(answer));
                bw.flush();
                bw.close();
                return;
        }

        if (arr[1] == '+') {
            answer += 0.3;
        } else if (arr[1] == '-') {
            answer -= 0.3;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
