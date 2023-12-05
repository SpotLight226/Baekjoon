
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if(arr[0]+arr[1] > arr[2]){ // 삼각형 조건에 맞다면 : 두 변의 길이 합이 가장 긴 변 보다 클 때
            System.out.println(arr[0] + arr[1] + arr[2]);
        }else{
            // 가장 긴 변의 길이를 최소로 줄였을 때의 둘레를 출력해야 하므로
            // 가장 긴 변의 길이를 작은 두 변의 합 -1 로 만든다 
            // 둘레 = 두 변 길이 합 + 가장 긴 변을 두 변 길이 합의 -1 로 한 값
            System.out.println((arr[0]+arr[1]) * 2 - 1);
        }

        br.close();
    }
}

