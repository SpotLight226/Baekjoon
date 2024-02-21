import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 끝에 있는 두 캥거루 중 하나가 다른 둘 사이에 점프할 때마다 이동가능한 좌표가 하나씩 줄어든다
        // 제일 많이 움직이기 위해서는 이동할 때마다 사이의 캥거루 중 큰 좌표에 있는 캥거루의 바로 앞에 뛰어야 한다
        // 즉, 사이의 거리가 짧은 캥거루가 뛰어야 가장 큰 사이 값 만큼 뛸 수 있다
        // 단, 끝 과 끝을 빼기만 하면 캥거루가 겹치기 때문에, -1 을 해준다

        int answer = Math.max((b - a), (c - b)) - 1;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

}
