// set 이용
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Set<Integer> set = new HashSet<>();
        int m = Integer.parseInt(br.readLine()); // 연산 수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            int in = 0;

            switch (str) {
                case "add": // S 에 x 를 추가
                    set.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove": // S에서 x를 제거
                    set.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check": // S에서 x 가 있는지 확인 후 있다면 출력에 1 없다면 0
                    in = Integer.parseInt(st.nextToken());
                    if (set.contains(in)) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case "toggle": // S에 x가 있는지 없는지 확인후 있다면 제거, 없다면 넣기
                    in = Integer.parseInt(st.nextToken());
                    if (set.contains(in)) {
                        set.remove(in);
                    } else {
                        set.add(in);
                    }
                    break;
                case "all": // S를 {1,2,....20} 으로 변경
                    set = new HashSet<>();
                    for (int j = 1; j < 21; j++) {
                        set.add(j);
                    }
                    break;
                case "empty": // S를 공집합으로
                    set.clear();
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}