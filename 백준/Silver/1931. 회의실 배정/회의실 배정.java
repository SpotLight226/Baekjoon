
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[][] timeTable = new int[n][2];

        // 각 시작 시간, 끝 시간을 2차원 배열에 넣는다
        // 시작 시간은 [0] ,  종료 시간은 [1]
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            timeTable[i][0] = Integer.parseInt(st.nextToken());
            timeTable[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(timeTable, (int[] o1, int[]o2) -> {
            // 종료 시간이 같을 때는 시작 시간 비교
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            // 종료 시간 비교
            return o1[1] - o2[1];
        });

        int count = 0;
        int end_time = 0;
        for(int i = 0; i < n; i++){
            // 시작 시간이 이전 종료 시간보다 작다면, 종료 시간을 해당 종료 시간으로 만든다
            if(end_time <= timeTable[i][0]) {
                end_time = timeTable[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}



