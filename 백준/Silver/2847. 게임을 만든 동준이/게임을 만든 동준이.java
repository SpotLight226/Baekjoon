import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 점수를 내리는 것을 최소한으로 하는 것이 중요!! >> 한단계 더 높은 레벨보다 1만큼만 작은 수
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] score = new int[N];

        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        for(int i=N-2; i>=0; i--){
            if(score[i]>=score[i+1]){
                count += (score[i]-score[i+1]+1);
                score[i] = score[i+1]-1;
            }
        }

        System.out.println(count);
    }
    
}