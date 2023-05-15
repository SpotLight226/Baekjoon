import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());  // 동전 종류 개수
		int k = Integer.parseInt(st.nextToken());  // k원
		int count = 0; // 동전 개수
		
		int[] coin = new int[n]; // 동전 종류 담을 배열
		
		for(int i = 0; i<n; i++) { // 동전을 배열에
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = n-1; i>=0; i--) {
            
			if(coin[i] <= k) { // coin[i]가 k보다 작거나 같을 때
				count += (k/coin[i]); // 개수에 몫 더하기
				k %= coin[i]; // k는 coin으로 나눈 나머지
				if(k == 0) break; // k가 0 이라면 for문 탈출
			}
		}	
		System.out.println(count);
	}
} 