import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 단어 개수
        int m = Integer.parseInt(st.nextToken()); // 외울 단어의 기준

        // 맵의 키 : 단어
        // 맵의 벨류 : 빈도
        HashMap<String, Integer> hashMap = new HashMap<>();

        while (n-- > 0) {
            String str = br.readLine();
            // 길이가 m 미만인 단어는 바로 외움
            if(str.length() < m) continue;
            // m 보다 길이가 길 때, hashMap 에 str을 넣는데, 빈도수를 가져와서, 만약 str 이 없다면 디폴트를 0으로 해서 + 1을 넣는다
            // str 이 있다면 + 1 해서 넣는다
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }
        // 맵의 키를 가져와서 list
        List<String> list = new ArrayList<>(hashMap.keySet());

        Collections.sort(list, (o1, o2) -> {
            // 자주 나오는 단어로 정렬
            // o1 과 o2 의 hashMap 의 빈도 (value) 를 비교해서 다르다면,
            // 빈도로 비교
            if (Integer.compare(hashMap.get(o1), hashMap.get(o2)) != 0) {
                // 빈도를 기준으로 내림차순 정렬
                return Integer.compare(hashMap.get(o2), hashMap.get(o1));
            }
            // 문장의 길이로 비교
            if (o1.length() != o2.length()) {
                // 길이로 비교
                // 양수라면, o2 가 앞으로 ( o2 더 김 )
                // 음수라면, o1 가 앞으로 ( o1 더 김 )
                return o2.length() - o1.length();
            }
            // 사전 순으로 비교
            return o1.compareTo(o2);
        });

        for (String s : list) {
            sb.append(s + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}