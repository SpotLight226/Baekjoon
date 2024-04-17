import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 집중국의 유지비 문제로 인해 각 집중국의 수신 가능 영역의 길이의 합을 최소화
        // 각 센서끼리의 거리를 구한 뒤, 가장 긴 거리를 제외하고 더한다
        int n = Integer.parseInt(br.readLine()); // 센서 개수
        int k = Integer.parseInt(br.readLine()); // 집중국 수

        int[] sensor = new int[n]; // 센서 배열
        int[] range = new int[n - 1]; // 거리 배열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sensor[i] = Integer.parseInt(st.nextToken());
        }
        // 각 센서의 위치를 오름차순 정렬
        Arrays.sort(sensor);

        // 센서별 사이 거리
        for (int i = 0; i < n-1; i++) {
            range[i] = sensor[i + 1] - sensor[i];
        }

        Arrays.sort(range);

        int answer = 0;

        // 센서 개수 - 집중국 수 만큼 사이 거리 빼고 합
        // 집중국 수만큼 더하기
        for (int i = 0; i < n - k; i++) {
            answer += range[i];
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}