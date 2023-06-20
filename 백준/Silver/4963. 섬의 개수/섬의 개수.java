
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[][] check;

    // 이동 포인터(방향) = 상, 하, 우, 좌, 상좌, 하좌, 상우, 상좌
    static int[] dirX = {0, 0, 1, -1, -1, -1, 1, 1};
    static int[] dirY = {-1, 1, 0, 0, -1, 1, -1, 1};

    static int nowX;
    static int nowY;
    static int w;
    static int h;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = "";
        while(!(str = br.readLine()).equals("0 0")) { // 0 0 이 입력시 while 끝
            st = new StringTokenizer(str);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();
            check = new boolean[h][w]; // 열 = h , 행 = w

            for(int i = 0; i<h; i++){
                st = new StringTokenizer(br.readLine());
                // 행 리스트
                ArrayList<Integer> row = new ArrayList<>();

                for(int j = 0; j<w; j++){
                    // 행 리스트에 각 값을 넣는다
                    row.add(Integer.parseInt(st.nextToken()));
                }
                // graph에 행 리스트를 넣는다
                graph.add(row);
            }

            int count = 0; // 섬 개수

            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    // 체크 배열이 false 고, graph 의 값에서 1일 때 count++한다
                    if(!check[i][j] && graph.get(i).get(j) == 1){
                        count++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(count);
//            sb.append(count + "\n");
        }
//        System.out.println(sb);
    }

    static void dfs(int x, int y){
        check[x][y] = true;

        // 각 이동에 대해서 포인트를 더해서 나타낸다
        for(int i =0; i<8; i++){
            // 상, 하, 우, 좌, 상좌, 하좌, 상우, 상좌 순으로 실행된다
            nowX = y + dirX[i];
            nowY = x + dirY[i];

            // check가 false고 graph의 값이 1, 범위체크 메서드가 true 일 때, dfs실행
            if(range_check() && !check[nowY][nowX] && graph.get(nowY).get(nowX) == 1){
                dfs(nowY, nowX);
            }
        }
    }

    static boolean range_check() {
        // nowX, nowY가 0보다 크고, nowX(행)이 h보다 작고, nowY(열)이 w보다 작으면 true
        // 2차원배열에서 h가 행이고, w가 열이다
        return (nowX >= 0 && nowY >= 0 && nowY < h && nowX < w);
    }
}

