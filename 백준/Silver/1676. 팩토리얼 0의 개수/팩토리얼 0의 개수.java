import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int num = Integer.parseInt(br.readLine()); // N!
		int count = 0; // 개수
         
        // n!의 뒤가 0이 되려면 2 * 5가 되어야 한다 즉,
        // n의 약수에 2,5가 있다면 10으로 뒤에가 0이 된다
        // 이 때, 2의 개수보다 5의 개수가 더 적으므로 5로 나누어 확인한다
        
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
	}
 
}