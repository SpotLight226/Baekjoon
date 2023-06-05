import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로프를 저장할 list
        ArrayList<Integer> list = new ArrayList<>();
        //로프를 저장
        for(int i =0; i <n; i++){
            int tmp = Integer.parseInt(br.readLine());
            list.add(tmp);
        }
        // 내림차순으로 로프를 정렬
        Collections.sort(list, Collections.reverseOrder());
        // 최댓값을 설정
        long max = 0;
        // 로프의 개수만큼 for문을 실행하며,
        for(int i =1; i<=list.size(); i++){
            // 로프로 들 수 있는 최대 무게
            long num = (long) list.get(i - 1) * i;
            // 최대 무개가 max보다 작다면 continue
            if(num < max) continue;
            // 아니라면 max 값을 수정
             else if (num > max)
                max = num;
        }
        System.out.print(max);
    }
}