import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 바구니의 개수
		int M = Integer.parseInt(st.nextToken()); // M번 회전
		
		int[] arr = new int[N]; // 바구니
		
		for(int i = 0; i<N; i++) { // 바구니에 번호
			arr[i] = i+1;
		}
		
		for(int i = 0; i<M; i++) { // M번 회전
			st = new StringTokenizer(br.readLine());
			// 배열 index이므로 -1
			int first = Integer.parseInt(st.nextToken())-1; // a번째 바구니부터 ( 처음 )
			int end = Integer.parseInt(st.nextToken())-1; // b번째 바구니까지 ( 끝 )
			int mid = Integer.parseInt(st.nextToken())-1; // 중간은 c번째
			
			int[] tmp = new int[mid-first]; // first ~ mid-1 값을 담을 바구니
			
			for(int j = first, k = 0; j<mid; j++, k++) { // first부터 mid-1까지를 tmp에
				tmp[k] = arr[j];
			}
			
			for(int j = mid, k = first; j<=end; j++, k++) { // mid부터 end까지를 first부터 차례로 담는다
				arr[k] = arr[j];
			}
			
			int in = first + (end-mid +1); // 넣을 자리는 end-mid +1 을 first에 더한 것
			for(int j = 0, k = in; j<tmp.length; j++, k++) { // 넣을 자리는 end-mid
				arr[k] = tmp[j];
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i] + " ");
		}
	}
}
