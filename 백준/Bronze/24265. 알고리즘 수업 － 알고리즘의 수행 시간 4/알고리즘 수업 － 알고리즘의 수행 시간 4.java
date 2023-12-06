import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Long n= Long.parseLong(br.readLine());
        // i는 [1, n-1], j는 [i+1, n]번 돈다
        // n-1 + n-2 + ... + 1 번 돌 때 차수는 1이므로 n*(n-1)/2 만큼 돈다
        // O(n^2)
		System.out.println(n*(n-1)/2);
		System.out.println('2');
	}
}	