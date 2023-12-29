import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] team = new int[n];
        int result = 0;

        Arrays.fill(team, 1); // 1로 배열을 채운다

        st = new StringTokenizer(br.readLine());
        // 손상된 카약 팀을 -1 해서 0으로
        for(int i=0;i<s;i++) { 
            int index = Integer.parseInt(st.nextToken())-1;
            team[index]--;
        }

        st = new StringTokenizer(br.readLine());
        // 여분을 가지고 있다면 +1
        for(int i=0;i<r;i++) {
            int index = Integer.parseInt(st.nextToken())-1;
            team[index]++;
        }

        for(int i=0;i<n-1;i++) {
            // 옆의 팀이 여분이 있다면 빌려줌
            if(team[i] == 0 && team[i+1] == 2) {
                team[i]++;
                team[i+1]--;
            }
            // 다음 팀의 여분이 없다면 앞팀이 빌려줌
            else if(team[i+1] == 0 && team[i] == 2) {
                team[i+1]++;
                team[i]--;
            }
        }

        for(int t:team) {
            if(t==0) result++;
        }

        bw.write(result+"");
        bw.flush();
        bw.close();

    }


}




