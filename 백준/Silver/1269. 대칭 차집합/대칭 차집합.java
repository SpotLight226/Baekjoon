import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>(); // A집합
        Set<Integer> setB = new HashSet<>(); // B집합

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int answer = 0;
        // A집합에서 num을 하나씩 B집합과 비교
        for(int num : setA) {
            if(!setB.contains(num)) {
                answer ++;
            }
        }
        
        // B집합에서 num을 하나씩 A집합과 비교
        for(int num : setB) {
            if(!setA.contains(num)) {
                answer ++;
            }
        }

        System.out.println(answer);
    }
}