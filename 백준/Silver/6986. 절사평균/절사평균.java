
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Double> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 점수 개수
        int k = Integer.parseInt(st.nextToken()); // 제외되는 점수 개수

        for (int i = 0; i < n; i++) {
            list.add(Double.parseDouble(br.readLine()));
        }

        Collections.sort(list); // 오름 차순 정렬

        Double total = 0.0;

        // 절사 평균
        for (int i = k; i < n - k; i++) {
            total += list.get(i);
        }

        System.out.printf("%.2f \n", total / (n - k * 2) + 1e-8);

        // 보정 평균
        for (int i = 0; i < k; i++) {
            total += list.get(k);
            total += list.get(n - k - 1);
        }

        System.out.printf("%.2f", total / n + 1e-8);
    }
}





