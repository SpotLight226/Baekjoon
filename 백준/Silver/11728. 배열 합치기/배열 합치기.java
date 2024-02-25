import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> a = new ArrayList<>(n);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> b = new ArrayList<>(n);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        // 각 포인터
        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            int aNum = a.get(p1);
            int bNum = b.get(p2);

            if (aNum <= bNum) {
                sb.append(aNum).append(" ");
                p1++;
            } else {
                sb.append(bNum).append(" ");
                p2++;
            }
        }

        if (p1 == n) {
            for (int i = p2; i < m; i++) {
                sb.append(b.get(i)).append(" ");
            }
        }
        if (p2 == m) {
            for (int i = p1; i < n; i++) {
                sb.append(a.get(i)).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
