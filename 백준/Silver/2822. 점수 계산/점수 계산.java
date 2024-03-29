import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] arr1 = new int[8];
        int[] arr2 = new int[5];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < 8; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 8; i++) {
            hash.put(arr1[i], i + 1);
        }

        Arrays.sort(arr1);

        int sum = 0;
        for (int i = 7, j = 0; i > 2; i--, j++) {
            sum += arr1[i];
            arr2[j] = hash.get(arr1[i]);
        }
        sb.append(sum).append("\n");

        Arrays.sort(arr2);

        for (int i = 0; i < 5; i++) {
            sb.append(arr2[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
