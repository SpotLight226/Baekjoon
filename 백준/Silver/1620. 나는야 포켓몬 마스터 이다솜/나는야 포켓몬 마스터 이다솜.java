import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int m = Integer.parseInt(st.nextToken()); // 문제 개수

        HashMap<String, Integer> nameMap = new HashMap<String, Integer>(); // 도감 번호 : 이름 key 으로 번호 value 를 찾기위한 해쉬
        HashMap<Integer, String> numberMap = new HashMap<Integer, String>(); // 도감 번호 : 번호 key 로 이름 value 을 찾기위한 해쉬

        for (int i = 1; i <= n; i++) {
            String pocketMon = br.readLine();
            nameMap.put(pocketMon, i); // 이름을 key 로 번호를 넣는다
            numberMap.put(i, pocketMon); // 번호를 key 로 이름를 넣는다
        }



        while (m-- > 0) {
            String question = br.readLine();
            if (49 <= question.charAt(0) && question.charAt(0) <= 57) {
                bw.write(numberMap.get(Integer.parseInt(question)) + "\n");
            } else {
                bw.write(nameMap.get(question) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();

    }
}


