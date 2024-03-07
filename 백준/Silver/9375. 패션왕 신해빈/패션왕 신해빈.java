import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            HashMap<String, Integer> hash = new HashMap<>();

            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                st.nextToken();

                String cloth = st.nextToken();

                if (hash.containsKey(cloth)) {
                    hash.put(cloth, hash.get(cloth) + 1);
                } else {
                    hash.put(cloth, 1);
                }
            }

            int answer = 1;

            for (int i : hash.values()) {
                   answer *= (i + 1);
            }

            bw.write(String.valueOf(answer - 1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
