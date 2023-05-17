import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		List<Integer> list = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 1; st.hasMoreTokens(); i++) { // 각 요소를 list에 저장
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list); // 정렬
		
		int result = list.get(0); // result를 list 처음 요소로 초기화
		
		for(int i = 1; i<list.size(); i++) {
			list.set(i, list.get(i-1) + list.get(i)); // list(1) = list(0) + list(1)
			result += list.get(i); // result에 list의 값을 누적합
		} 
		
		System.out.println(result);
		
	}
}