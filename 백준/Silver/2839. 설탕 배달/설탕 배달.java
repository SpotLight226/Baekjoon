import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		if(n == 4 || n == 7) { // 4, 7는 5와3으로 표현할 수 없다
			System.out.println(-1); 
		} else if ( (n%5) == 1 || (n%5) == 3) { // n을 5로 나누었을 때, 1,3이라면 n/5 + 1
			System.out.println(n/5 + 1);
		} else if ( (n%5) == 2 || (n%5) == 4) { // n을 5로 나누었을 대, 2,4라면 n/5 + 2
			System.out.println(n/5 + 2);
		} else if ( n%5 == 0) { // n이 5의 배수라면 n/5
			System.out.println(n/5);
		}
	}
}