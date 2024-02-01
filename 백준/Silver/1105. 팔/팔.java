import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String left = st.nextToken();
        String right = st.nextToken();

        br.close();
        int count = 0;

        // 8이 가장 적게 나온 경우를 구해야 한다
        // 왼쪽 과 오른 쪽의 숫자의 길이가 다르면 ex) 10, 100
        // 무조건 8이 들어간다
        // 길이가 똑같다고 해도, 가장 앞 자리의 숫자가 다르다면, 8 이 안 들어가도 되는 수가 존재한다
        if (left.length() == right.length()) {
            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) != right.charAt(i)) {
                    break;
                } else {
                    if (left.charAt(i) == '8') {
                        count++;
                    }
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
