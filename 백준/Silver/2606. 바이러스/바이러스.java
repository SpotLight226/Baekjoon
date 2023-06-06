import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] check;
    static int com,net;
    static int count; // 바이러스 감염되는 컴퓨터의 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        com = Integer.parseInt(br.readLine()); // 총 컴퓨터의 수(정점)
        net = Integer.parseInt(br.readLine()); // 네트워크에 연결되어 있는 컴퓨터 쌍의 수(간선)

        // 인덱스를 맞춰주기 위해 0은 쓰지 않는다
        graph = new boolean[com+1][com+1]; // 인접행렬
        check = new boolean[com+1]; // 방문 확인 배열
        //연결된 컴퓨터를 인접행렬에 넣는다
        for(int i = 0; i<net; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = true; //인접행렬 그래프에 컴퓨터가 연결 되어 있다는 것을 표시
        }
        
        dfs(1); //dfs메서드를 호출 -> 1번 컴퓨터시작된다고 문제에 나와있음

        System.out.println(count -1 ); // 1은 한번 체크했으므로 -1 을 해준다
        br.close();
    }

    public static void dfs(int index){
        check[index] = true; // 호출된 check[index]를 true로 변경 => 탐색을 했다는 뜻이다
        count++; // 네트워크에 연결되어 있다는 뜻이므로 ++
        for(int i = 1; i<=com; i++){ // 모든 정점을 돌아가며 탐색
            if(!check[i] && graph[index][i]){ // 탐색을 하지 않았고(false), 인접 행렬에서 true일 때
                dfs(i); // dfs 메서드를 호출한다
            }
        }
    }
}