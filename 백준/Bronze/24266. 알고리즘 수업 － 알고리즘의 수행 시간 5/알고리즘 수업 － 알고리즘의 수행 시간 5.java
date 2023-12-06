import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Long n= Long.parseLong(br.readLine());
        // 삼중 for문이므로 n ^ 3 즉 시간복잡도는 O(n^3)
		System.out.println(n*n*n);
		System.out.println('3');
	}
}