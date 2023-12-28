import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>(); // 중복을 제거하기 위해 hashset 사용

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
                
        List<Integer> list = new ArrayList<>(set); // Collection 을 사용하기 위해 list에 넣기

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i).append(" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();    

    }
}