import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 가지고 있는 것과 발견한 것 합침
        int bottle = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken()); // 새거 받을 수 있는 병 수

        int answer = 0;
        while (bottle >= c) {
            answer += bottle / c;
            bottle = (bottle % c) + (bottle / c);
        }

        System.out.println(answer);
    }
}