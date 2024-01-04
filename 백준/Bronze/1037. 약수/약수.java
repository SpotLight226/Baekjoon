
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine()); // 개수

        int[] arr = new int[count]; //약수를 저장

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬 후 가장 작은 수 * 가장 큰 수 를 하면 n을 구할 수 잇다
        Arrays.sort(arr);

        bw.write(arr[0] * arr[count-1] + ""); // 숫자를 문자형으로 변형하기 위해 "" 을 추가

        br.close();
        bw.flush();
        bw.close();
    }
}




