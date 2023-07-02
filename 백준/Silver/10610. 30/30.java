
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int sum = 0;
        int len = n.length();

        char[] charA = n.toCharArray();
        Arrays.sort(charA);

        StringBuilder sb = new StringBuilder();
        for(int i = len-1; i>=0; i--){
            int num = charA[i] - '0'; // 캐릭터형은 -'0' 하면 숫자가 된다
            sum += num; // 3의 배수임을 판단하기 위해서 각 숫자를 더함
            sb.append(num); // 가장 큰 숫자를 만들기위해 sb에 더함
        }

        // 30 의 배수인지 조건설정
        // 정렬한 캐릭터 배열의 첫 요소가 0 이 아니거나 or 모두 더한 합이 3의 배수가 아니라면 30의 배수 아님
        if(charA[0] != '0' || sum%3 != 0){ // -1 출력하고 메인 끝냄
            System.out.println(-1);
            return;
        }

        System.out.println(sb.toString());

    }
}


