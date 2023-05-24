import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = Integer.MAX_VALUE; // 초기 값 판단을 위한 MAX_VALUE 사용
									 // sum이 MAX_VALUE 와 다르다면, 첫번째 값이 아닌 것
		
		// - 를 기준으로 나누어 준다
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		// ex) 55-50+40
		// st에 token은 55 와 55+40
		while(st.hasMoreTokens()){
			int temp = 0; // 연산을 저장할 변수
			
			// sub의 token은 55 와 50,40
			StringTokenizer sub = new StringTokenizer(st.nextToken(), "+");
			
			while(sub.hasMoreTokens()) {
				temp += Integer.parseInt(sub.nextToken());
			}
			
			// sum의 값에 아무런 변동이 없다면, 초기 값이다
			if(sum == Integer.MAX_VALUE){
				sum = temp;
			} else sum -= temp;
		}
		System.out.println(sum);
	}
}