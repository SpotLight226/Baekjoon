import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];

        for(int i = 0; i <8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";

        for(int i = 0; i <7; i++){
            if(arr[i] == arr[i+1] - 1){ // 다음 요소의 -1 이 앞의 요소와 같다면
                result = "ascending";
            } else if( arr[i] == arr[i+1] + 1){ // 다음 요소의 +1이 앞의 요소와 같다면
                result = "descending";
            } else {
                result = "mixed ";
                break; // mixed 라면 더 이상 for문을 실행할 이유 없음
            }
        }

        System.out.println(result);
    }
}

