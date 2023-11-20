import java.io.*;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0; i<n; i++) {
			String line = br.readLine();
			Stack<Character> st = new Stack<>();
			
			for(int j=0; j<line.length(); j++) {
                // 이전 문자와 현재 문자가 같다면 pop
				if(st.size()>0 && st.peek() == line.charAt(j)) {
					st.pop();
				}else {
                    // 아니라면 넣기
					st.push(line.charAt(j));
				}
			}
            // 모두 진행하고 크기가 0이라면 cnt ++
			if(st.size()==0) cnt++; 
		}
		System.out.println(cnt);
	}
}