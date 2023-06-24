
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
            int target = Integer.parseInt(st.nextToken());

            if(binarySearch(list, target)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }

    static boolean binarySearch(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (list.get(mid) == target) {
                return true;
            } else if (list.get(mid) < target) {
                start = mid + 1;
            } else if (list.get(mid) > target) {
                end = mid - 1;
            }
        }
        return false;
    }
}

