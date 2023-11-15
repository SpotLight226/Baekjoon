import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken()); // 15
        int S = Integer.parseInt(st.nextToken()); // 28
        int M = Integer.parseInt(st.nextToken()); // 19
        
        int year = 1;
        int e = 1,s = 1,m = 1;
        // 주어진 목푯값에 도달했을 때 반복문을 탈출
        while(e != E || s != S || m != M)
        {
            e++;
            s++;
            m++;
            // e,s,m이 각자에 해당하는 최댓값에 마주칠 때마다 1로 초기화
            if(e > 15) e = 1;
            if(s > 28) s = 1;
            if(m > 19) m = 1;
            // 매 반복마다 year값을 증가
            year++; // 
        }
        System.out.println(year);
    }
}