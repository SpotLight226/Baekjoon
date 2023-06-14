
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int big = Integer.parseInt(st.nextToken());

            if(big == 0) break;

            List<Integer> list = new ArrayList<>();

            for(int i = 0; st.hasMoreTokens(); i++){
                int tmp = Integer.parseInt(st.nextToken());
                if(big < tmp){
                    list.add(big);
                    big = tmp;
                } else {
                    list.add(tmp);
                }
            }

            sb.append((Math.pow(big, 2) == (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2))
                                                                                    ?"right" : "wrong")+ "\n");
        }
        System.out.println(sb);
    }
}
