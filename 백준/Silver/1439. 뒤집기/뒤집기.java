import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        // 0을 기준으로 나눈 토큰
        StringTokenizer st1 = new StringTokenizer(str, "0");
        // 1을 기준으로 나눈 토큰
        StringTokenizer st2 = new StringTokenizer(str, "1");
        // 둘 중에 토큰 수가 작은 것을 출력
        System.out.println(Math.min(st1.countTokens(), st2.countTokens()));
    }
}