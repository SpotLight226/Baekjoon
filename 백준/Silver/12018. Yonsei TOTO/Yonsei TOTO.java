import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 과목 수
        int m = Integer.parseInt(st.nextToken()); // 주어진 마일리지

        List<Integer> needs = new ArrayList<>(); // 필요한 마일리지 저장

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken()); // 신청 인원
            int l = Integer.parseInt(st.nextToken()); // 수강 인원

            Integer[] arr = new Integer[p];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < p; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Collections.reverseOrder()); // 역순 정렬

            if (p < l) { // 신청 인원이 수강 인원보다 적으면 1만 필요
                needs.add(1);
            } else {
                needs.add(arr[l - 1]); // 필요한 마일리지 저장 (마일리지 같으면 우선)
            }
        }

        Collections.sort(needs); // 필요 마일리지 오름차순 정렬

        int answer = 0;
        for (int need : needs) {
            if (m >= need) {
                m -= need;
                answer++;
            } else {
                break;
            }
        }

        System.out.println(answer);
    }
}
