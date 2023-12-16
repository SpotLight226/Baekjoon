import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 테스트 케이스

        long[] arr = new long[n];

        // 정수 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        br.close();

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(findPrimeNumber(BigInteger.valueOf(arr[i]))) + "\n");
        }

        bw.flush();
        bw.close();
    }
    
    // 소수 판별
    static BigInteger findPrimeNumber(BigInteger n) {
        
        // 소수라면 n return
        // isProbablePrime
        // certainty에 대한 값이 10이상이면 해당 값이 소수인지에 대한
        // 판별률이 높아지기 때문에 10을 매개변수로 전달
        if (n.isProbablePrime(10)) {
            return n;
        }
        // nextProbablePrime
        // 다음 소수 값을 반환하는 메서드
        // BigInteger보다 큰 첫 번째 정수를 보유하는 Biginteger를 반환
        return n.nextProbablePrime();
    }
}


