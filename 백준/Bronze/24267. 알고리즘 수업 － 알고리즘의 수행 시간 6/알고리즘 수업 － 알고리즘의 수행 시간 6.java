import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        int count = 0;
        /*
        for(int i = 1; i <= n-2; i++){
            for(int j = i+1; j <= n-1; j++){
                for(int k = j+1; k <= n; k++){
                    count++;
                }
            }
        }

        br.close();

        bw.write(count+"\n" + 3);
        bw.flush();
        bw.close();
        */
        
        // 위 코드를 실행했을 때, 
        // O(n X (n-1) X (n-2)/6) 이고
        // 차수 3임을 알 수있다
        br.close();

        bw.write((n*(n-1)*(n-2)/6)+"\n" + 3);
        bw.flush();
        bw.close();

    }
}