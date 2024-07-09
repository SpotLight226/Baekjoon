import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine()); //먹어야할 초콜릿
        int n = 1;
        int answer = 0;
        // 초콜릿을 k개 먹기 위해서는 초콜릿 크기가 k 또는 2로만 나누어지기 때문에 2의 제곱크기가 필요
        while(n < k) n = n * 2; // 1부터 2의 제곱으로 필요한 초콜릿 크기를 구한다

        sb.append(n).append(" ");
        // 쪼개기
        while (k > 0) {
            if (k >= n) { 
                k -= n;
            } else {
                n /= 2; // 초콜릿이 k보다 크면 반 쪼개기  
                answer++;
            }
        }

        sb.append(answer);

        System.out.println(sb);
    }
}
