
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer> card;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine()); // 카드의 개수
        card = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            card.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(card); // 이분 탐색위해 정렬

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (m-- > 0) {
            // 이분 탐색 실행해서 true면 1
            if (checkCard(Integer.parseInt(st.nextToken()))) sb.append(1).append(" ");
            // false라면 0
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }

    public static boolean checkCard(int a) {
        int leftIndex = 0; // 왼쪽 인덱스
        int rightIndex = n - 1; // 오른쪽 인덱스

        while (leftIndex <= rightIndex) { // 왼쪽 인덱스가 오른쪽 인덱스보다 작거나 같을때 까지
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = card.get(midIndex); // 중앙 인덱스로 중간 숫자

            if (a < mid) { // 숫자가 중간 인덱스의 숫자보다 작다면
                rightIndex = midIndex - 1; // 오른쪽 인덱스를 중간 인덱스의 -1
            } else if (a > mid) { // 숫자가 중간 인덱스의 숫자보다 크다면
                leftIndex = midIndex + 1;  // 왼쪽 인덱스를 중간 인덱스의 +1
            } else { // 중간 숫자랑 매개변수 a가 같다면
                return true;  // true 리턴
            }
        }
        return false; // 위에서 리턴이 없었다면 false
    }
}


