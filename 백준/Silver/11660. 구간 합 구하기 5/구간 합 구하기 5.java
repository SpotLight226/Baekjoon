import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder(); // 결과 저장할 문자열
		
		int N = Integer.parseInt(st.nextToken()); // 2차원 배열의 크기 N*N
		int M = Integer.parseInt(st.nextToken()); // 합을 구해야하는 횟수
		
		int[][] sum = new int[N+1][N+1]; // N*N으로 생성시 1 1 입력-> ArrayIndxeOutOfBound에러
		
		// 합배열을 생성 O[N]
		for(int i =1; i<=N; i++) { // 행
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j<=N; j++) {
				sum[i][j] = sum[i][j-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i<=N; i++) { // 열
			for(int j = 2; j<=N; j++) {
				sum[j][i] += sum[j-1][i];
			}
		}
		// (x1, y1, x2, y2)
		// 부분합 sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1]
		for(int i = 0; i<M; i++) { 
			st = new StringTokenizer(br.readLine());
			// 각 좌표
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1]; // 부분합
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
