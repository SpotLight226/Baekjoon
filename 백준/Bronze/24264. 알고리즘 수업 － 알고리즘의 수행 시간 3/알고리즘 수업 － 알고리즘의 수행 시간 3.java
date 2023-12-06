import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Long n= Long.parseLong(br.readLine()); // int 형으로 받으면 범위를 벗어난다
        // 이중 for문의 경우 O(n^2) 
        // 차수는 2
		System.out.println(n*n);
		System.out.println('2');
	}
}