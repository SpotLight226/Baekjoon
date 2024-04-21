import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] answer = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }   
        // 오름 차순 정렬 : 가장 작은 수 ~ 가장 큰 수
        Arrays.sort(arr);       

        int start = 0;
        int end = n - 1;
        int min = Integer.MAX_VALUE; // 최솟 값

        int sum;
        // start ->  <- end
        while (start < end) {
            // 둘의 합
            sum = arr[start] + arr[end];

            // 절댓 값을 비교하여 0과 가까운 합을 찾는다
            // 최솟값이 현재 start, end 인덱스의 합보다 크다면, 0에서 더 멀어진 것이므로 갱신
            if (min > Math.abs(sum)) {
                min = Math.abs(sum); // 최솟값 갱신 
                answer[0] = arr[start]; // 현재 start 인덱스 값
                answer[1] = arr[end]; // 현재 end 인덱스 값

                if(sum == 0) break; // sum 이 0 이라면 더이상 할 필요 없음
            }

            // 합계가 0 보다 작다면, start (음수) 에서 인덱스 증가
            if (sum < 0) {
                start++;
                // 합계가 0보다 크다면, end(양수) 에서 인덱스 증가
            } else {
                end--;
            }
        }

        bw.write(answer[0] + " " + answer[1]);
        bw.flush();
        bw.close();
        br.close();
    }
}