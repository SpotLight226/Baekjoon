import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();
        int[] arr = new int[6]; // 점들을 저장할 배열

        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 각 점의 좌표를 이용해서 점들을 설정
        // 0,1 => a | 2,3 => b | 4,5 => c
        //
        if ((arr[2] - arr[0]) * (arr[5] - arr[1]) == (arr[4] - arr[0]) * (arr[3] - arr[1])) {
            bw.write("-1");
            bw.flush();
            bw.close();
            return;
        }

        double ab = getLength(arr[0], arr[1], arr[2], arr[3]);
        double bc = getLength(arr[2], arr[3], arr[4], arr[5]);
        double ca = getLength(arr[4], arr[5], arr[0], arr[1]);

        double max = Math.max(ab, Math.max(bc, ca));
        double min = Math.min(ab, Math.min(bc, ca));

        bw.write(String.valueOf(2 * (max - min)));
        bw.flush();
        bw.close();
    }

    static double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
