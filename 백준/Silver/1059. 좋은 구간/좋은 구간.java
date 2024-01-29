import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < l; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int n = Integer.parseInt(br.readLine());

        br.close();

        Collections.sort(list);

        // 모든 정수는 0 보다 크고 1000 보다 작거나 같다
        int start = 0;
        int end = 1000;

        // 리스트의 첫 번째 값이 n보다 큰 경우, 첫 번째 값이 end가 된다.
        if (list.get(0) > n) {
            end = list.get(0);
        } else {
            for (int i = 0; i < l - 1; i++) {
                // 만약 n이 리스트의 값 중 하나와 같다면, 좋은 구간은 존재하지 않음
                if (list.get(i) == n || list.get(i + 1) == n) {
                    System.out.println(0);
                    return;
                }
                // n이 현재 값과 다음 값 사이에 위치한 경우
                if (list.get(i) < n && list.get(i + 1) > n) {
                    start = list.get(i);
                    end = list.get(i + 1);
                }
            }
        }

        // 좋은 구간의 개수 계산
        // n - start - 1 : n 과 start 사이 정수 개수
        // end - n - 1 : n 과 end 사이 정수 개수
        int answer = n - start - 1 + end - n - 1 + (n - start- 1) * (end - n - 1);
        System.out.println(answer);
    }
}