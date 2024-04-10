import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr;

        while (true) {
            String str = br.readLine();
            if(str.equals("#")) break;

            arr = str.toCharArray();

            int answer = 0;
            for (int i = 0; i < arr.length; i++) {

                char c = Character.toLowerCase(arr[i]);

                if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                    answer++;
                }
            }
            bw.write(String.valueOf(answer));
            bw.newLine();
            answer = 0;
        }

        bw.flush();
        bw.close();
        br.close();

    }
}