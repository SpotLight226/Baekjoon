import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long x = Long.parseLong(st.nextToken()); // 집 위치 x 좌표
        long y = Long.parseLong(st.nextToken()); // 집 위치 y 좌표
        long w = Long.parseLong(st.nextToken()); // 블럭 좌우로 한칸 이동시 거리
        long s = Long.parseLong(st.nextToken()); // 대각선 이동 거리

        long temp1 = 0;
        long temp2 = 0;
        long temp3 = 0;

        temp1 = (x+y) * w; // 블럭 평행 이동시

        if ((x + y) % 2 == 0) { // w ,y 좌표가 짝수
            temp2 = Math.max(x, y) * s; // 대각선으로만 이동한다
        } else { // w, y 좌표가 홀수
            temp2 = (Math.max(x, y) - 1) * s + w; // 한 칸 전까지 대각선 이동 후 나머지 평행 이동
        }
        // 대각선으로 적당량 가고, 나머지 평행 이동
        // x,y 좌표 중 작은 값만큼 대각선 이동 후 대각선 이동 후 남은 거리만큼 w 로 이동
        temp3 = (Math.min(x, y))*s+(Math.abs(x-y))*w;


        System.out.println(Math.min(temp1, Math.min(temp2, temp3)));

    }
}