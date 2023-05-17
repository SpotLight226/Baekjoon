import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		br.readLine(); // N
		
		List<Integer> list = new ArrayList<>(); // 배열 A 
		Queue<Integer> list2 = new LinkedList<>(); // 배열 B - queue를 사용해 가장 큰값이 삭제 될 때, 자리 이동 발생 X
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; st.hasMoreTokens(); i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list); // 가장 작은 값이 앞으로 올 수 있도록 정렬
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; st.hasMoreTokens(); i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}
		
		int result = 0;

		for(int i =0; i<list.size(); i++) {
			int a = list.get(i); // 정렬을 했으므로 가장 작은 값부터 나온다
			int b = Collections.max(list2); // 배열 A 중 가장 큰값
			list2.remove(b); // b를 list2에서 제거
			 
			result += a*b; // 둘의 곱을 결과에 누적
		}
		
		System.out.println(result);
	}
}