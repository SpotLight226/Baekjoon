
import java.io.*;
import java.math.BigInteger;

public class Main {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger res = new BigInteger("1");

        if(n <= 20){ // 20보다 작을 떄
            sb.append((int)Math.pow(2, n) - 1).append("\n");
            hanoi(n,1,2,3);
            System.out.println(sb);
        } else { // 20 보다 클 때 => 20보다 크면 long 보다 크므로 Math.pow 를 사용할 수 없다
            // bigInteger 객체를 사용해서 계산하고, 출력한다
            for(int i = 0; i < n; i++){
                res = res.multiply(new BigInteger("2"));
            }
            res = res.subtract(new BigInteger("1"));
            System.out.println(res);
        }




    }

    // start : 시작 : 원판이 쌓인 시작 지점
    // mid : 중간 : 옮기기위해 이동해야할 곳
    // end : 끝 : 목적지
    public static void hanoi(int n , int start, int mid, int end){
        // 원판이 하나라면
        if(n == 1) {
            sb.append(start + " " + end + "\n");
            return;
        }

        // 1. n-1 개를 중간으로 옮긴다
        hanoi(n - 1, start, end, mid);

        // 2. 가장 밑의 1개를 마지막으로 옮긴다
        sb.append(start + " " + end + "\n");

        // 3. 중간으로 옮긴 n-1개를 마지막으로 옮긴다
        hanoi(n - 1, mid, start, end);

    }
}



