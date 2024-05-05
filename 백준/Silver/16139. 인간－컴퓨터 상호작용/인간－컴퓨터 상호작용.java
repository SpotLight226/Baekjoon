import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[str.length() + 1][26];

        // 누적합
        // 1. 각 문장의 문자에서 -'a'(97) 를 하여 배열의 인덱스로 활용할 수 있게 만든다
        // 2. 모든 알파벳을 반복문으로 확인하며, 현재 문자의 앞에 있는 값에 따라 + 1 또는 앞의 값을 그대로 넣는다
        for (int i = 1; i <= str.length(); i++) {

            int search = str.charAt(i - 1) - 'a'; // 1

            // 2
            for (int j = 0; j < 26; j++) {
                int value = arr[i - 1][j];

                arr[i][j] = (j == search) ? value + 1 : value;
            }
        }

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            int find = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken()) + 1; // 시작
            int end = Integer.parseInt(st.nextToken()) + 1; // 끝

            sb.append(arr[end][find] - arr[start - 1][find]).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}