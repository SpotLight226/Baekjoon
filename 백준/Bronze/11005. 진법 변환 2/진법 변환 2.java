import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());  // 10진수
		int B = Integer.parseInt(st.nextToken());  // B진법
		
		// n진수를 10진수로 변환할 때 : Integer.parseInt(String 입력, n진수)
		// 10진수를 n진수로 변환할 때 : Integer.toString(입력, n진수)
		String change = Integer.toString(N, B);
		System.out.print(change.toUpperCase()); // 소문자로 나오기 때문에 대문자로 변경
	}
}