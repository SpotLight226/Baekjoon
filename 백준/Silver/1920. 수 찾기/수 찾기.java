import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 자연수 개수

        list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        while (n-- > 0) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list); // 이분 탐색 실행 위해 정렬

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        while (t-- > 0) {
            // target 값
            int target = Integer.parseInt(st.nextToken());
            // list 와 target 으로 이진탐색을 돌린다
            if(binarySearch(list, target)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
    
    //이진탐색 구현
    static boolean binarySearch(ArrayList<Integer> list, int target) {
        int start = 0; // 시작 인덱스
        int end = list.size() - 1; // 끝 인덱스
        int mid; // 중간 인덱스

        while (start <= end) { // 시작 인덱스가 끝 인덱스보다 작을 때까지 실행 없다면 false 반환
            mid = (start + end) / 2 ; // 중간 인덱스 설정
            
            // 중간 인덱스의 값이 target 과 같다면  true
            if (list.get(mid) == target) {
                return true;
                // mid 값이 target 보다 작다면
            } else if (list.get(mid) < target) {
                // 검색의 시작 위치를 반 자른 것(mid)의 +1 로
                start = mid + 1;
                // mid 값이 target 보다 크다면
            } else if (list.get(mid) > target) {
                // 검색 끝 위치를 반 자른 것(mid)의 - 1 로
                end = mid - 1;
            }
        }
        // 위의 while문을 돌렸을 때, true가 반환 안 된다면, false 를 반환한다
        return false;
    }
}



