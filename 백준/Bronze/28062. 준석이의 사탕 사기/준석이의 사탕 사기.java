import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n]; // 내림차순 정렬위한 Integer 객체 배열로 생성

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

        int answer = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) { // 홀수일 때
                if (odd != 0) { // 만약 앞에 다른 홀 수가 있었다면 
                    answer += odd + arr[i]; // 답에 앞의 홀수와 현재 홀수의 합을 더한다
                    odd = 0; // 앞의 홀수를 다시 0으로
                } else {
                    odd = arr[i]; // 앞에 홀수가 없다면 해당 수를 홀수에 저장
                }
            }

            if (arr[i] % 2 == 0) { // 짝수라면 그냥 더함
                answer += arr[i];
            }
        }

        System.out.println(answer);
    }
}
