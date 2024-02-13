import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for (int h = 0; h < 3; h++) {
            for (int m = 0; m < 3; m++) {
                for (int s = 0; s < 3; s++) {
                    if (h != m && m != s && s != h) {
                        if (arr[h] >= 1 && arr[h] <= 12 && arr[m] >= 0 && arr[m] <= 59 && arr[s] >= 0 && arr[s] <= 59) {
                            answer++;
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
