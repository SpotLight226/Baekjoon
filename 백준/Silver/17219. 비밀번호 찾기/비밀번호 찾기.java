import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 사이트 수
        int m = Integer.parseInt(st.nextToken()); // 찾으려는 사이트 수

        HashMap<String, String> hashMap = new HashMap<>(n);

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String site = st.nextToken();
            String password = st.nextToken();

            hashMap.put(site, password);
        }

        while (m-- > 0) {
            sb.append(hashMap.get(br.readLine())).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
