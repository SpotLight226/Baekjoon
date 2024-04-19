import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hash = new HashSet<>();
        int answer = 0;

        while (n-- > 0) {
            String str = br.readLine(); // 닉네임

            // ENTER 라면 새로운 유저가 들어 온 것
            // HashSet 은 중복을 허용하지 않기 때문에 그대로 저장
            // 즉, 처음 들어왔을 때만 이모티콘을 쓰므로, 처음 들어온 유저 닉네임을 저장해둬서
            // 처음 쓴 이모티콘 개수를 저장한다 => 중복 허용 안해서 몇 번이 나와도 한 번만 저장
            if (str.equals("ENTER")) {
                // 그동안 들어가 있던 멤버의 개수 를 누적
                answer += hash.size();
                // 다시 닉네임 저장 시작 => 처음 유저가 새로 들어왔으므로, 다시 이모티콘 시작
                hash = new HashSet<>();
            } else {
                // ENTER 이 후에는 계속 닉네임 저장
                hash.add(str);
            }
        }
        // 모든 반복 후, 남아 있는 닉네임 개수 저장
        answer += hash.size();

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}