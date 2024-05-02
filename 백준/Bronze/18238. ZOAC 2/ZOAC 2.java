import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력을 문자 배열로 
        char[] arr = br.readLine().toCharArray();
        
        // 시작점인 A 는 아스키코드 에서 65
        int start = 65;
        int answer = 0;

        for (char c : arr) {
            // 왼쪽 값 : 시작 점 - 현재 문자의 아스키 코드값
            int left = start - c;
            // 오른쪽 값 : 현재 문자의 아스키 코드값 - 시작 점
            int right = c - start;
            
            if (left < 0) {
                left += 26;
            } else if (right < 0) {
                right += 26;
            }

            answer += Math.min(left, right);

            start = c;

        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();


    }

}