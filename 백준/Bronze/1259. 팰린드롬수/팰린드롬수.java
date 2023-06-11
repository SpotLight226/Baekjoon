import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String num = br.readLine();

            if(num.equals("0")) break;

            String reverse = "";

            for(int i = num.length() - 1; i >= 0; i--){
                reverse += num.charAt(i);
            }

            System.out.println((num.equals(reverse))? "yes" : "no");
        }
    }
}

