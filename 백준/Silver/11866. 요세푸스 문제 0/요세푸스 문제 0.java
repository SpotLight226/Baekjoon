import java.util.*;
import java.io.*;

public class Main {
	static Queue<Integer> que = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		sb.append("<");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
        // 1 ~ n 까지 Queue 담는다
		for(int i=1; i<N+1; i++) {
			que.add(i);
		}
        
        // k 번에 해당하는 값만 poll 
        // 아니라면 poll 하고 temp에 저장했다가 다시 add
        // queue 의 크기가 1이 될 때까지 반복하며 StringBuider에 묶어놨다가 마지막에 poll 하며 > 붙여서 출력
		while( que.size() > 1 ) {
			for(int i=0; i<K-1; i++) {
				int temp = que.poll();
				que.add(temp);
			}
			int num = que.poll();
			sb.append(num).append(", ");
		
		}
		
		int num = que.poll();
		sb.append(num).append(">");

		System.out.println(sb);
	}
}