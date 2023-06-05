import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i <n; i++){
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }

        Collections.sort(list, Collections.reverseOrder());

        long max = 0;
        for(int i =1; i<=list.size(); i++){
            long num = (long) list.get(i - 1) * i;
            if(num > max)
                max = num;
        }
        System.out.print(max);
    }
}