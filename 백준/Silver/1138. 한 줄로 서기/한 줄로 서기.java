import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 이 문제는 해당하는 입력에 대해서 키가 큰 순으로 list에 삽입한다
        // 키가 가장 큰 사람 => 0 으로 입력 받음
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n + 1]; // 각 사람의 왼쪽에 있는 사람의 수 저장
        List<Integer> list = new ArrayList<>(); // 인덱스와 인자를 넘겨줄 리스트

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n; i >= 1; i--) {
            // arr 의 값을 인덱스로해서 i를 값으로 넘겨준다
            list.add(arr[i], i);
        }

        for (int i : list) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
