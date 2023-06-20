
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    static boolean[] check;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph= new ArrayList<>();
        check = new boolean[n+1]; // 체크 배열 : 인덱스를 맞춰주기 위해 +1
        int result = 0;

        for(int i = 0; i <= n; i++){ // 이중 ArrayList에 새로운 ArrayList를 각각 넣는다
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<m; i++){ // m번 수행 -> 노드의 개수
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end); // start 인덱스인 ArrayList에 end를 넣는다
            graph.get(end).add(start); // end 인덱스인 ArrayList에 start를 넣는다
        }

        for(int i = 1; i<=n; i++){ // 정점의 개수만큼 수행
            if(dfs(i) == 1){
                result++;
            }
        }
        System.out.println(result);
    }

    private static int dfs(int n){
        if(check[n]){ // check[n]이 true라면
            return 0;
        }
        check[n] = true; // 체크처리
        int size = graph.get(n).size(); // n번 인덱스인 ArrayList의 길이
        for(int i = 0; i<size; i++){
            int node = graph.get(n).get(i); // n번 인덱스인 ArrayList에서 i번째 요소
            if(!check[node]){ // 체크배열에서 false라면 dfs호출
                dfs(node);
            }
        }
        return 1;
    }
}

