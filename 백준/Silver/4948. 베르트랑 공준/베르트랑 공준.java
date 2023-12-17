
import java.io.*;

class Main {

    // n은 123,456 이하 이므로, 2n + 1 크기로 판별 배열
    public static boolean[] arr = new boolean[246913];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        getPrime(); // 소수 찾기

        while (true) {
            int n = Integer.parseInt(br.readLine());

            int count = 0;

            if(n == 0) break; // n 이 0 이면 반복 종료

            for (int i = n + 1; i <= 2 * n; i++) {
                // arr 가 false 라면 소수이므로 count + 1
                if (!arr[i]) count++;
            }

            bw.write(count + "\n");
        }

        bw.flush();

    }

    // 소수 찾는 메서드
    // 모든 범위에 대해서 소수를 미리 찾아둔다
    static void getPrime(){
        // 0, 1 은 소수 아님
        arr[0] = arr[1] = true;

        // 에라토스테네스의 체
        // 루트 n이하 까지 반복하여 배수들을 제외
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if(arr[i]) continue; // 소수가 아니라고 이미 판별했으면 스킵
            for(int j = i * i; j < arr.length; j += i ){
                arr[j] = true;
            }
        }
    }
}


