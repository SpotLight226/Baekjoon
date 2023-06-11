import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        for(int i = 0; st.hasMoreTokens(); i++){
            int tmp = Integer.parseInt(st.nextToken());

            sum += tmp * tmp; // 합계에 각 요소의 제곱을 더한다
        }

        System.out.println(sum%10); // 10으로 나눈 나머지

    }
}

