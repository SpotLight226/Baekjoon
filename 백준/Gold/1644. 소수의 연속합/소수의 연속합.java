import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        makePrime(n);

        // 시작 인덱스, 끝 인덱스,
        // 정답 카운트, 수 합계 (2는 미리 넣어 놓기)
        int start = 0;
        int end = 1;
        long sum = 2;
        int answer = 0;
        int size = primeList.size(); // 끝 인덱스를 확인

        while (start < size) {
            // 합이 같다면, 정답 카운트 올리고, 합계에서 가장 앞에 있는 소수 빼기
            if (sum == n) {
                answer++;
                sum -= primeList.get(start);
                start++;
            }
            // 합계가 더 크다면, 합계에서 가장 앞에 있는 소수 빼기
            else if (sum > n) {
                sum -= primeList.get(start);
                start++;
            }
            // 합계가 n 보다 작다면, 더할 소수 인덱스를 올리고, 넣기
            else {
                if(end >= size) break;
                sum += primeList.get(end);
                end++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    // 소수 리스트 만들기
    static void makePrime(int n) {
        boolean[] temp = new boolean[n + 1];

        // 0, 1 은 소수 아님
        temp[0] = temp[1] = true;

        //에라스트로스의 체
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // 이미 확인한 것 패스
            if (temp[i]) continue;

            for (int j = i + i; j < temp.length; j = j + i) {
                temp[j] = true;
            }
        }

        // 소수인 것만 소수 리스트에 넣기
        for (int i = 1; i <= n; i++) {
            if (!temp[i]) {
                primeList.add(i);
            }
        }
    }

}