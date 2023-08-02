import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 결과를 저장할 문자열

		int n = Integer.parseInt(br.readLine()); // 1~n까지의 정수 : n번 수행
		int stackl = 0; // stack의 위치

		Stack<Integer> stack = new Stack<>(); // 수열을 다룰 stack

		while(n>0) { // O[N]
			int num = Integer.parseInt(br.readLine()); // 입력받은 정수

			if(num > stackl) {
				for(int i = stackl; i<num; i++) {    // 입력받은 수까지 push
					stack.push(i+1); 			     // 숫자를 push i = 0에서 시작했기 때문에 +1
					sb.append("+").append("\n"); // + 와 개행문자를 sb에 추가
				}
				stackl = num; // stack의 위치를 num으로 초기화
			}

			else if(!(stack.peek() == num)){ // stack의 맨 위의 요소를 확인하고 num과 다르다면
					System.out.println("NO"); // NO를 출력
					return; 	 // while문 탈출후 종료
				}	

			stack.pop(); // pop
			sb.append("-").append("\n");
			
			n--;
		}
		System.out.println(sb); // 결과를 출력
	}
}