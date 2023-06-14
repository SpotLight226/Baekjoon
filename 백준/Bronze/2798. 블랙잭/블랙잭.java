
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 카드의 개수
        int m = Integer.parseInt(st.nextToken()); // 최대 수

        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; st.hasMoreTokens(); i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int result = search(list, n, m);
        System.out.println(result);
    }

    static int search(List<Integer> list, int n, int m){
        int result = 0;
        // 3개 고르므로 n-2번 순회
        for(int i = 0; i<n-2; i++){
            // 첫 요소가 m 보다 크면 스킵
            if(list.get(i) > m) continue;
                // 두번 째요소는 n-1까지 순회
            for(int j = i+1; j<n-1; j++){
                // 1번째 + 2번째가 m 보다 크면 스킵 : 볼 필요 없다
                if(list.get(i) + list.get(j) > m) continue;
                // 3번째 요소는 n번
                for(int k = j + 1; k<n; k++){
                    // 임시 3요소를 더한 것
                    int tmp = list.get(i) + list.get(j) + list.get(k);
                    // tmp와 m 이 같다면 더 이상 볼 필요 없다
                    if(tmp == m){
                        return tmp;
                    }
                    // tmp가 m보다는 작고, 순회를 돌면서 만든 result보다 크다면
                    if(tmp < m && result < tmp){
                        result = tmp; // result를 tmp로 교체
                    }
                }
            }
        }
        return result; // 순회 다 돌고, result 반환
    }



}
