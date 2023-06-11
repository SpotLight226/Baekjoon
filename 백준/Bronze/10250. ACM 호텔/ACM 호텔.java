import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t > 0){
            st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken()); // 층
            int w = Integer.parseInt(st.nextToken()); // 층마다 방
            int n = Integer.parseInt(st.nextToken()); // 몇번째 손님

            int x = (n/h) + 1; // 방의 번호
            int y = n%h; // 층
            if(n%h == 0){ // 층의 첫번째 방이 비어있을 때
                x = n/h; // 첫번째 방
                y = h; // 층
            }
            System.out.println(y*100+x);
            t--;
        }
    }
}

