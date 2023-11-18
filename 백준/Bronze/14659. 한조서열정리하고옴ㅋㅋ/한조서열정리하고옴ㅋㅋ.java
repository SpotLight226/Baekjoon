import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 봉우리 수
        int[] arr = new int[N]; // 봉우리 배열
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int answer = Integer.MIN_VALUE;
        //각 봉우리에 활잡이 탐색
        for(int i=0;i<N;i++){
            int count = 0;
            int h = arr[i];
            for(int j=i+1;j<N;j++){
                if(h < arr[j])	//더 높은 봉우리 만났을 때 종료
                    break;
                else	//처치 성공!
                    count++;
            }
            //최고의 활잡이 비교하기
            answer = Math.max(answer, count);
        }
        bw.write(answer + "");	//BufferedWriter 저장
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}