import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 개수
        
        // 기본 데이터 타입인 int 형에는 내림차순 정렬인 Collections 를 사용할 수 없으므로 Integer
        Integer[] arr = new Integer[n]; 

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder()); // 내림 차순 정렬

        int answer = 0;

        for (int i = 0; i < n - 2; i++) {
            // 삼각형의 조건 = 가장 긴 변의 길이가 다른 두 변의 합보다 작아야 한다
            if (arr[i] < arr[i + 1 ] + arr[i + 2]) {
                answer = Math.max(answer, arr[i] + arr[i + 1] + arr[i + 2]);
            }
        }
        // answer 이 0 이라면 삼각형 조건인 것이 없다는 뜻이므로 -1
        if (answer == 0) {
            answer = -1;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
