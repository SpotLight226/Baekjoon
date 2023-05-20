import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
	
public class Main{
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); // 단어 입력
		int sec = 0;
		
		String[] arr = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		for(int i = 0; i<str.length(); i++) {
			for(int j = 0; j<arr.length; j++) {
					if(arr[j].contains(Character.toString(str.charAt(i))) == true) {
					sec += (j+3);  // 3초, 4초, 5초, 6초.....10초 == j+3
			}
		}
	}
		System.out.print(sec);
		
	}
}	