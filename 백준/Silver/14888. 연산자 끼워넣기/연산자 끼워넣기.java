import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int max = Integer.MIN_VALUE; // 최대
    static int min = Integer.MAX_VALUE; // 최소

    static int[] arr;
    static int[] op = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine()); // 수 개수

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 숫자 받기
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        // 각 연산자의 숫자 받기
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        backTrack(arr[0], 1);

        bw.write(max + "\n" + min);
        bw.flush();
        bw.close();
        br.close();
    }

    // 모든 연산자 배열에서 +,-,*,/ 순으로 처음 하나를 넣는다고 생각하고
    // 다음에 들어갈 첫 연산자 다음에 들어갈 가지의 수 대로 경우의 수가 늘어난다
    // idx 가 1로 들어가서 다음 숫자인 arr[1] 을 arr[0] 에 연산하고
    // 연산 결과, idx + 1 을 다음 dfs 에 넣는다
    // 이 때, n 은 숫자의 개수이자 배열의 길이로 idx 가 + 1 씩해서 n 과 같다면
    // 해당 연산에서 arr(숫자 배열) 을 다 탐색한 것이기 때문에
    // Math 함수를 사용하여 최대, 최소 값을 정의한 후, return 하여 바로 전 연산으로 돌아온다
    // 다른 연산자가 아직 남아있다면, 다시 dfs를 호출하여 연산한다
    // 연산 가지의 끝 하나 앞에서 모든 경우의 수를 확인한 후
    // 다음 연산 가지로 넘어간다

    static void backTrack(int num, int idx) {

        // idx = n 은 모든 탐색 완료
        if (idx == n) {
            max = Math.max(max, num); // 최대
            min = Math.min(min, num); // 최소
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) { // 연산자 존재시
                op[i]--; // 하나 빼서 쓰기
                switch (i) { // i에 따라서 각 연산을 결정
                    // 숫자 배열에서 다음 인덱스에 해당하는 숫자를 연산
                    case 0:
                        backTrack(num + arr[idx], idx + 1);
                        break;
                    case 1:
                        backTrack(num - arr[idx], idx + 1);
                        break;
                    case 2:
                        backTrack(num * arr[idx], idx + 1);
                        break;
                    case 3:
                        backTrack(num / arr[idx], idx + 1);
                        break;
                }
                op[i]++; // 빼서 쓴 거 채워넣기
            }
        }
    }
}
