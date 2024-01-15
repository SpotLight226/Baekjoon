import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        int n = 0;
        // 입력 숫자를 하나씩 떼어서 10의 i 승을 곱해가며
        // 처음 시계 방향으로 읽은 숫자를 구함
        for (int i = 3; i >= 0; i--) {
            n += Integer.parseInt(st.nextToken()) * Math.pow(10, i);
        }

        int cn = getClockNum(n);

        int answer = 0;

        for (int i = 1111; i <= cn; i++) {
            // 1111 부터 시작해서 세계수를 구하는 메서드를 통과한 값이
            // i 와 같다면 세계수라는 뜻이므로 answer를 + 1
            if(getClockNum(i) == i ) answer++;
        }

        System.out.println(answer);

    }
    
    // 시계수 구하는 메서드
    static int getClockNum(int n) {
        
        int temp = n; // 임시 세계수

        for (int i = 0; i < 3; i++) {
            // 입력된 n 에서 1000의 나머지 를 구하고 (가장 앞의 수 떼냄)
            // 10 을 곱해서 원래 4자리로 만듦
            // 가장 앞의 수를 더 해서 다른 세계수로 업데이트 
            temp = (temp % 1000  * 10) + (temp / 1000);
            
            // n 과 temp 중 작은 수로 n을 변경
            n = Math.min(temp, n);
        }
        return n;
    }
}





