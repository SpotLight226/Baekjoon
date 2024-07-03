import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String search = br.readLine();
        int answer = 0;

        // 문서에 찾는 문자가 있는지 확인하여 있으면 while 문 돌아감
        while (word.contains(search)) {
            int index = word.indexOf(search); // 찾는 문자의 시작 인덱스
            // 찾는 문자의 시작 인덱스 + 문자의 길이를 더한 만큼 문서에서 문자 삭제
            word = word.substring(index + search.length()); 
            answer++;
        }

        System.out.println(answer);
    }
}