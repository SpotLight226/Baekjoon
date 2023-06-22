import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[][] check;
    // 이동 포인터 -> 상, 하, 좌, 우
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {-1, 1, 0, 0};
    static int nowX;
    static int nowY;
    static int m;
    static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            m = Integer.parseInt(st.nextToken()); // 가로 길이
            n = Integer.parseInt(st.nextToken()); // 세로 길이
            int k = Integer.parseInt(st.nextToken()); // 배추의 수
            // out of index 피하기 위해 +1 해서 만든다
            graph = new int[n+1][m+1];
            check = new boolean[n+1][m+1];
            
            // 배추의 위치를 표시하는 배열 만들기
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken()); // 가로의 좌표
                int y = Integer.parseInt(st.nextToken()); // 세로의 좌표
            
                graph[y][x] = 1; // 그래프의 위치를 1로 변경한다
            }
            int count = 0;
            
            // 2차원 배열의 세로 인덱스에서 모든 행을 dfs 돌린다
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                 // 조건 : check(방문 배열)이 false 고, 배추가 있을 때
                    if(!check[i][j] && graph[i][j] == 1){
                        count++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void dfs(int y, int x){ // 세로 좌표와 가로 좌표가 들어오므로 임의로 y x라 작성
        // 방문한 위치를 true처리
        check[y][x] = true;
        // 현재 위치에서 상, 하, 좌, 우 로 이동할 때 배추가 있는지를 확인
        for(int i = 0; i<4; i++){
            nowY = y + dirY[i];
            nowX = x + dirX[i];
            // 이동 위치가 범위 안에 있고, 방문 배열에서 false 고, 배추가 있을 때
            if(range_check() && !check[nowY][nowX] && graph[nowY][nowX] == 1){
                dfs(nowY, nowX); // dfs 호출
            }
        }
    }
    // 이동한 좌표가 전체 배열 범위를 벗어나지 않았는지 확인
    static boolean range_check() {
        return (nowX >= 0 && nowY >=0 && nowX <= m && nowY <= n);
    }
}


