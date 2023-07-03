
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[n][n];

        System.out.println(bino_coef(n, k));
    }
        static int bino_coef(int n, int k){
            if( k > n){
                return 0;
            }

            if( k == 0 || k ==n){
                return 1;
            }

            return bino_coef(n-1, k-1) + bino_coef(n-1,k);
        }
}


