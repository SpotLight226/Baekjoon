
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 시험장 수

        int[] arr = new int[n]; // 시험장 배열

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        br.close();
        long answer = 0;

        answer += n; // 먼저 시험장 수에서 각각에 총감독관을 넣는다

        for (int i = 0; i < n; i++) {
            arr[i] -= b; // 총 감독관이 감독할 수 있는 수를 뺀다
            if (arr[i] <= 0)  // 총 감독관의 감독 수를 뺐을 때 음수라면 감독관 충분
                continue; // 스킵
            answer += arr[i] / c; // 부 감독관이 필요한 만큼 넣기
            //  부 감독관의 감독 학생수를 뺐는데 0이 아니라면 더 필요함
            if (arr[i] % c != 0) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}




