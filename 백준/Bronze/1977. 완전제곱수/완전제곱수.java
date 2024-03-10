import java.io.*;
import java.util.*;

public class Main {

    static char[] str1;
    static char[] str2;

    static Integer[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {

            int temp = (int) Math.pow(i, 2); // 제곱 수

            if (m <= temp && temp <= n) {
                list.add(temp);
            }

            if(temp > n) break; // n 보다 크다면 범위 넘어가므로 break
        }

        if (list.isEmpty()) {
            System.out.println(-1); // 제곱수 없다면 끝
        } else {
            int answer = 0;
            for (int i = 0; i < list.size(); i++) {
                answer += list.get(i);
            }
            System.out.println(answer); // 정답
            System.out.println(list.get(0)); // 최솟값
        }

    }

}
