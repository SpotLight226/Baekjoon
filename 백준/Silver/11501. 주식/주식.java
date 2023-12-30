import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 테스트 케이스
        int[] arr;
        StringTokenizer st;
        while(t-->0){
            int n = Integer.parseInt(br.readLine()); // 일 수
            long answer = 0;
            st = new StringTokenizer(br.readLine());
            arr = new int[n];
            // 주식 시세 저장
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = arr[n - 1]; // 마지막 값을 가장 큰 시세로 저장
            //역방향 탐색 진행!
            for(int j=n-2;j>=0;j--) {
                if(arr[j] <= max)	//가장 큰 시세보다 작은 시세일 때 판매!
                    answer += max - arr[j];
                else		//가장 큰 시세보다 큰 시세 탐색시 바꾸기
                    max = arr[j];
            }
            bw.write(answer + "\n");	//시세 차익의 합 BufferedWriter 저장
        }
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}




