import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i = 1; // 출력에 붙여 줄 번호
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(l == 0 && p == 0 && v == 0) { // 0 0 0 일 때, 종료
				break;
			}
			
			int result = (v/p) * l + Math.min(l, (v%p));
			System.out.println("Case " + i + ": " + result);
			i++;
		}
	}		
}