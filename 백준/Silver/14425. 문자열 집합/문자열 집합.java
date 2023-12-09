import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 문자열 집합 개수
        int M = Integer.parseInt(st.nextToken()); // 집합에 들어있는지 판단할 문자열 개수

        int count = 0; // 포함 확인 카운트
        Set<String> arr = new HashSet<>(); // 문자열 해쉬셋
        
        // 문자 집합 만들기
        for (int i = 0; i < N ; i++) {
            arr.add(br.readLine());
        }
        
        // 집합에 들어있는지 확인해서 있으면 count + 1
        for (int i = 0; i < M ; i++) {
            if(arr.contains(br.readLine())) count++;
        }

        System.out.println(count);



    }
}