import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int temp = str.indexOf("pPAp", i);
            if(temp == -1) break;
            answer++;
            i = temp + 3;
        }

        System.out.println(answer);
    }
}