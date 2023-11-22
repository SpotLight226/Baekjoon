import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, temp, result=0;
    static ArrayList<Integer> list = new ArrayList<Integer>();


    public static void main(String args[]) throws Exception{
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            temp = Integer.parseInt(st.nextToken());
            list.add(temp);
        }

        for(int i: list){
            result+=i;
        }
        result-=Collections.max(list);

        System.out.print(result);
    }    
}