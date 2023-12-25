import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 멤버 수
        int[] arr = new int[n * 2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n * 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(arr); // 오름 차순으로 정렬
        // 각 팀에 귢등히 분해하기 위해서는 오름차순으로 정렬한 후 [0, 2n], [1, 2n -1]...
        // 이런 식으로 팀을 만들어주면 된다
        int min = 200000; // 멤버들의 최대 역량은 100000 이므로 100000, 99999 가 최대 이므로 200000으로 설정

        for (int i = 0; i < n; i++) {
            int score = arr[i] + arr[2 * n - 1 - i]; // 가장 앞이랑 가장 뒤를 더해서 역량 확인
            if (score < min) {
                min = score;
            }
        }

        bw.write(min + "");
        bw.flush();
        bw.close();
    }
}



