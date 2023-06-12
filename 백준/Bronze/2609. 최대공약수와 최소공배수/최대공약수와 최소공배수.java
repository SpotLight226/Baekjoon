import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int c = gcd(a, b);

        System.out.println(c);
        System.out.println(a*b / c);
    }
    // 최대 공약수 : 유클리트 호제법 = a, b의 최대 공약수는  b, r의 최대 공약수와 같다
    // 이때, r = a%b 다 
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
