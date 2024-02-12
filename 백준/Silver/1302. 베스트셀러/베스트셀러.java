import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hash = new HashMap<>(); // 책 이름과 판매 개수를 저장할 hashMap

        for (int i = 0; i < n; i++) {
            String bookTitle = br.readLine();
            // bookTitle 을 key 로 hash 에 넣는다
            // 만약 bookTitle 이 hash 에 존재하지 않는 다면 defaultValue 로 0을 반환
            // bookTitle 이 이미 들어 있다면 value 에 +1
            hash.put(bookTitle, hash.getOrDefault(bookTitle, 0) + 1);
        }

        int max = 0; // 최대 판매
        String bestSeller = ""; // 가장 많이 팔린 책

        // hash 에서 entrySet 을 반복
        // Map.Entry => Map 에서 한 쌍의 entry 를 반환
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            String title = entry.getKey();
            int sale = entry.getValue();
            // 판매 수가 max 보다 크다면 또는 판매 수가 max 와 같고, 현재 가장 많이 팔린 책과 사전 순 비교해서 앞이라면
            // compareTo => 사전 보다 뒤 == 양수, 사전 보다 앞 음수
            if (sale > max || (sale == max && title.compareTo(bestSeller) < 0)) {
                max = sale;
                bestSeller = title;
            }
        }

        bw.write(bestSeller);
        bw.newLine();

        bw.flush();
        bw.close();
        br.close();
    }
}
