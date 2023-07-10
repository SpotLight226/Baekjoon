
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static HashMap<Integer, Integer> cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 가지고 있는 카드의 개수

        cards = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        while(n --> 0){
            int tmp = Integer.parseInt(st.nextToken());

            if(cards.containsKey(tmp)){
                cards.replace(tmp, cards.get(tmp), cards.get(tmp) + 1);
            } else {
                cards.put(tmp, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        while(m --> 0) {
            int check = Integer.parseInt(st.nextToken());
            if(cards.containsKey(check)){
                bw.write(cards.get(check) + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}


