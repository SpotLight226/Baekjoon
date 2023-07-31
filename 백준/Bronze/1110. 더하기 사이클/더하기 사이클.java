import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int count;
    static String s;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();

        int n = Integer.parseInt(s);

        int count = Cycle(n);

        System.out.println(count);
    }

    static int Cycle(int n){

        count++;

        String str = "";
        if(n < 10){
            str = "0" + n;
        } else {
            str = n + "";
        }

        int sum = str.chars().map(c -> (char) c - '0').sum();

        int result = ((str.charAt(1) -'0') * 10) + (sum%10);

        if(!String.valueOf(result).equals(s)){
            Cycle(result);
        }

        return count;
    }
}

