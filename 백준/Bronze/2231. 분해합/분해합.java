
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 생성자 : 입력값 == (생성자) + (입력값의 길이로 정해지는 생성자의 숫자 개수)
        // -> input == con + (con1 + con2 + con3 ..)
        // -> input - (con1 + con2 + con3 ..) = con
        // -> 가장 작은 생성자 = con1 con2 con3...이 가장 클 때, con은 가장 작다
        // -> 이때 각 con(n) 요소는 숫자이므로 0~9 -> 가장 큰 수 = 9
        // -> 입력의 길이가 3일 때, con의 요소가 9 9 9 일 때, con이 가장 작다
        // -> for( int i = input - ( 3 * input_length() ) 부터 시작한다면 가장 작은 생성자부터 시작한다
        String n = br.readLine(); // 길이를 알기 위해 문자열로

        int n_length = n.length(); // 숫자 n의 길이

        int num = Integer.parseInt(n); // n을 int 형 으로 변환

        int result = 0;

        for(int i = num - ( 9 * n_length); i<num; i++){ // 가장 작은 생성자부터 시작한다
            int tmp = i; // 계산에 사용될 임시 변수
            int sum = 0; // 생성자 각 요소의 합

            while(tmp != 0){
                sum += tmp%10; // 숫자  tmp 의 각 자릿수를 하나씩 떼어 sum에 더한다
                tmp /= 10; // tmp를 10으로 나눈 몫으로
            }

            if(sum + i == num) { // 생성자일 때, 결과를 i로 저장하고 break
                result = i;
                break;
            }
        }

        System.out.println(result);
    }

}
