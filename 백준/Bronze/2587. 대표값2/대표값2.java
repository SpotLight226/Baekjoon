
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int avg = (int)Arrays.stream(arr).sorted().average().getAsDouble();
        int mid = Arrays.stream(arr).sorted().skip(2).findFirst().getAsInt();
        System.out.println(avg);
        System.out.println(mid);
    }
}


