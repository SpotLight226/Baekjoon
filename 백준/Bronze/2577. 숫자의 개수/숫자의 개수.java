import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String num = String.valueOf(a * b * c);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<=9; i++){
            map.put(i, 0);
        }

        for(int i = 0; i<num.length(); i++){
            int tmp = num.charAt(i) - '0';

            map.put(tmp, map.get(tmp)+1);
        }

        for(int i =0; i<10; i++){
            System.out.println(map.get(i));
        }

    }
}
