
import java.io.*;

class Main {

    // n은 1,000,000 이므로
    public static boolean[] arr = new boolean[1000001];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        getPrime(); // 소수 찾기

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            // 해당 숫자가 소수면서 N에서 소수를 뺀 값이 소수면 count++
            for (int i = 2; i <= n/2; i++) {
                if(!arr[i] && !arr[n - i])count++;
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();

    }

    // 소수 찾는 메서드
    // 모든 범위에 대해서 소수를 미리 찾아둔다
    static void getPrime(){
        // 0, 1 은 소수 아님
        arr[0] = arr[1] = true;

        // 에라토스테네스의 체
        // 루트 n이하 까지 반복하여 배수들을 제외
        for (int i = 2; i < Math.sqrt(1000000); i++) {
            if(arr[i]) continue; // 소수가 아니라고 이미 판별했으면 스킵
            for(int j = i * i; j < 1000001; j += i ){
                arr[j] = true;
            }
        }
    }
}


