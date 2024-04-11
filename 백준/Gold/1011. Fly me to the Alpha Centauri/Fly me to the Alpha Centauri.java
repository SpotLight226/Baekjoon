import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 어렵다 어려워,
        // 이런 문제는 표를 그려서 눈으로 보면서 풀이하기
        // https://st-lab.tistory.com/79
        // 위의 링크 참고
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y - x;

            // k 광년 이동시, k -1, k +1  광년 이동 가능
            // 한번 이동거리 최대값은 거리의 루트 값에서 소수점을 버린 정수 값
            // dis = 1 => max = 1, dis = 2 => max = 1, dis = 3 => max = 1, dis = 4 => max = 2, dis = 5 => max =2
            // .... dis = 9 => max = 3, dis = 10 => max = 3
            // 한번 이동거리 최대값이 변할 때마다 이동 횟수(count) 는 2번 씩 변한다
            // max = 1, dis = 1 => count = 1, max = 1, dis = 2 => count = 2(1), max = 1, dis = 3 => count = 3(2)
            // max = 2, dis = 4 => count = 3
            // max 가 변하면 count 도 변한다
            // 즉, max 가 변할 때 count 는 ( 2 * max - 1)

            int max = (int) Math.sqrt(distance);
            // 한번 이동할 수 있는 거리의 최대값이 거리의 루트 값과 같다면, max 가 변화한 것이므로 count 도 변해야 한다
            if (max == Math.sqrt(distance)) {
                sb.append(2 * max - 1).append("\n");
            }
            // 각 한번 이동할 수 잇는 최대 값 별로 묶었을 때,
            // max * max < distance <= max * max + max
            // 이 때 count 는 2 * amx
            else if (distance <= max * max + max) {
                sb.append(2 * max).append("\n");
            }
            // 이외의 조건은 2 * max + 1
            else {
                sb.append(2 * max + 1).append("\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}