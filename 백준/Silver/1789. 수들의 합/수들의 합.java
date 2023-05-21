import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(check());
		
	}
	
	static int check() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long num = Long.parseLong(br.readLine());
		Long result = 0L; // 합을 확인할 변수
		
		int count = 0;
		
		for(int i = 1; ; i++) {
			result += i;
			
			if(result > num) {
				break;
			}
			count++;
		}
		return count;
	}
}