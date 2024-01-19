import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 점수 저장 변수
        int A = 0;
        int B = 0;

        String last = "D"; // 마지막으로 이긴 사람

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(st.nextToken()); // a가 낸 것
            int b = Integer.parseInt(st2.nextToken()); // b가 낸 것

            if (a > b) { // A 승
                A += 3;
                last = "A";
            } else if (a < b) { // B 승
                B += 3;
                last = "B";
            } else { // 무승부
                A++;
                B++;
            }
        }

        sb.append(A + " " + B).append("\n");

        if(A > B) {
            sb.append("A");
        }else if(A < B) {
            sb.append("B");
        }else {
            sb.append(last);
        }

        System.out.println(sb);
    }
}