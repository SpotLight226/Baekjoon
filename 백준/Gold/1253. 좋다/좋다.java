import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // n개의 수
		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 투포인터를 사용하기 위해 정렬한다
		Arrays.sort(arr);

		System.out.println(check(arr));
	}

	static int check(int[] arr) {
		int result = 0;

		for(int i = 0; i<arr.length; i++) {
			int left = 0;
			int right = arr.length-1;

			while(true) {
				//현재 내 위치(i)에 있을 때
				if(left == i) left++;
				else if (right == i) right--;

				// 두 포인터가 겹쳐진다면, 값이 아닌 것 
				if(left >= right) break;

				if(arr[left] + arr[right] > arr[i]) right--; // 합이 크다면 right--
				else if(arr[left] + arr[right] < arr[i]) left++; //합이 작다면 left++
				else {
					result++;
					break; // 이미 좋은 수 라는 것을 확인 했으니 반복 종료
				}
			}
		}

		return result;
	}
}