import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static boolean[] arr = new boolean[10001]; // 제한이 10000까지

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 시
        int B = Integer.parseInt(st.nextToken()); // 분
        int C = Integer.parseInt(st.nextToken()); // 초

        int D = Integer.parseInt(br.readLine()); // 필요한 시간

        // 1분 = 60초, 1시간 = 60분
        // D에 60을 나눠서 나온 몫과 나머지를 각 분, 초에 합산
        B += D / 60; // 분 합
        C += D % 60; // 초합
        //C를 60초 아래로 정리 : 몫과 나머지를 분과 초에 합산 및 대입
        B += C / 60; // 분 넣기
        C = C % 60; // 초 정리
        //B 를  60분 아래로 정리 :몫과 나머지를 분과 초에 합산 및 대입
        A += B / 60; // 시 넣기
        B = B % 60; // 분 나머지
        // 시는 23 까지 이므로 % 24
        A = A % 24;

        bw.write(A + " " + B + " " + C);
        bw.flush();
        bw.close();
        br.close();
    }
}
