import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
 
public class Main {
	
	public static int N;
	public static Integer[] arr; // Integer Wrapper 클래스
	public static int answer = 0;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	arr = new Integer[N];
    	
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		arr[i] = Integer.parseInt(st.nextToken());
    		
    	}
    	Arrays.sort(arr, Collections.reverseOrder());
    	
        //내림차순으로 정렬 후, 유제품의 3개중 가장 저렴한것이 무료로 제공
        // 즉, (3, 3, 2) 가 있으면 2를 구매하지 않도록 처리
    	for(int i=0;i<N;i++) {
    		if(i % 3 == 2) {
    		}else {
    			answer += arr[i];
    		}
    	}
    	System.out.println(answer);
    }
    
}