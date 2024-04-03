import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int jaehwon = br.readLine().length();
        int doctor = br.readLine().length();

        if (jaehwon >= doctor) {
            bw.write("go");
        } else {
            bw.write("no");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}