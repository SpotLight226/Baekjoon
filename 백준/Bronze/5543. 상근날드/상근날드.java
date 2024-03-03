import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int burger = 2001;
        int drink = 2001;

        for (int i = 0; i < 3; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp < burger) {
                burger = temp;
            }
        }

        for (int i = 0; i < 2; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp < drink) {
                drink = temp;
            }
        }

        bw.write(String.valueOf(burger + drink - 50));
        bw.flush();
        bw.close();
        br.close();

    }
}
