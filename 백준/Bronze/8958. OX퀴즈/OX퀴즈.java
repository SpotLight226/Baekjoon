import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine()); // 횟수
		
		while(M > 0) {
			String[] arr = br.readLine().split(""); // 입력을 받아 한 글자씩 나눔
			int[] num = new int[arr.length];
			int score = 0;
			
			if(arr[0].equals("O")) {
				num[0] = 1;
				score += num[0];
			} else { 
				num[0] = 0;
				score += num[0];
			}
			
			for(int i = 1; i < arr.length; i++) {
				if(arr[i].equals("O")) {
					num[i] = num[i-1] + 1;
					score += num[i];
				} else {
					num[i] = 0;
					score += num[i];
				}
			}
			System.out.println(score);
			M--;
		}
		
	}
}