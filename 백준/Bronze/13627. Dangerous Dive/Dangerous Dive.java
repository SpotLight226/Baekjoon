import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 봉사자 수
        int r = Integer.parseInt(st.nextToken()); // 돌아온 수

        boolean[] arr = new boolean[n]; // 인덱스 0 부터 1로 시작

        st = new StringTokenizer(br.readLine());

        br.close();
        for (int i = 0; i < r; i++) {
            int idx = Integer.parseInt(st.nextToken()) - 1;
            arr[idx] = true;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!arr[i]) {
                sb.append(i + 1).append(" ");
                count++;
            }
        }

        if (count == 0) {
            bw.write("*");
        } else {
            bw.write(String.valueOf(sb));
        }
        
        bw.flush();
        bw.close();
    }
}



