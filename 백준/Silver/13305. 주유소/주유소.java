import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] km = new long[n - 1]; // 다음 주유소 까지 거리
        long[] price = new long[n]; // 각 주유소 가격

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<km.length; i++) {
            km[i] =  Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<price.length; i++) {
            price[i] = Long.parseLong(st.nextToken()); 
        }

        long sum = 0;
        long min = price[0];
        
        // 앞 뒤 주유소의 가격을 비교해서 최솟값을 바꿔가며 주유
        for(int i=0; i<km.length; i++) {
            if(price[i] < min) {
                min = price[i];
            }
            sum += (min * km[i]);
        }

        System.out.println(sum);
    }
}