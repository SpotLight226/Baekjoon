import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = null;

        while(true){
            String num = br.readLine();
            // 입력 0일 때 종료
            if(num.equals("0")) break;
            // StringBuilder 사용
            sb = new StringBuilder(num);
            // 입력을 역순으로
            String reverse = sb.reverse().toString();
            // 입력 == 역순 일 때, yes 아니면 no

            System.out.println((num.equals(reverse))? "yes" : "no");
        }
    }
}

