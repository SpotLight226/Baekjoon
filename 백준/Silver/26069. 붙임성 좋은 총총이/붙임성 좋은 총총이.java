import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        HashSet<String> hash = new HashSet<>();
        // 총총이는 무조건 나온다
        hash.add("ChongChong");

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String p1 = st.nextToken();
            String p2 = st.nextToken();

            // 1. 둘 중 하나가 ChongChong 이라면 둘 다 넣는다 ( 둘 다 춤 추고 있음 )
            // 2. 이제부터는 해쉬에 p1, p2 가 들어가 있다면, 춤을 추게 되므로 해쉬에 넣는다
            if (hash.contains(p1) || hash.contains(p2)) {
                hash.add(p1);
                hash.add(p2);
            }
        }

        bw.write(String.valueOf(hash.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}