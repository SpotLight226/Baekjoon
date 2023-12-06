import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
        // for문은 for문의 변수(i 등)만큼 시간 복잡도 O(n)
		System.out.println(n);
		System.out.println('1');
	}
}