import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[26];

        // 각 문장에서 알파벳에 해당하는 위치의 10^ 에 대한 비중 배열이 만들어진다
        // ex)
        // 2
        // AAA -> 1 * 10^2 + 1 * 10^1 + 1 * 10^0 = 111
        // AAA -> 1 * 10^2 + 1 * 10^1 + 1 * 10^0 = 111
        // ==> 0, 0, .... 222
        // 다른 알파벳은 0 이기 때문에 222 * 9 = 1998

        // 특정 알파벳이 더 큰 비중을 가지고 있는지는 확인할 필요 없다
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                // str.charAt(j) - 'A' => 각 알파벳의 자릿 수
                // 10 승 (글자 길이(str.length() -1) - j(반복문으로 진행하며, 각 자릿 수를 빼준다)
                // 알파벳 별 비중 배열 생성
                arr[str.charAt(j) - 'A'] += (int) Math.pow(10, str.length() - 1 - j);
            }
        }
        // 오름차순 정렬
        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));

        int answer = 0;
        int num = 9;
        for (int i = 25; i >= 0; i--) {
            answer += arr[i] * num;
            num--;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}