import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int input = Integer.parseInt(br.readLine(), 16);
		
		System.out.println(input);
    }
}