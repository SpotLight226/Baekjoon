import java.io.*;
import java.util.*;

public class Main {

    static char[] str1;
    static char[] str2;

    static Integer[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();

        // 처음 푸는 문제
        // LCS
        // 2차원 배열 dp 를 만들어서 2개의 1차원 배열을 비교한다
        // 같은 값(단어) 가 나올 때마다 부분 수열 길이에 + 1 한다
        // 만약 각 배열의 같은 인덱스 부분의 단어가 다르다면 2차원 배열에서 왼쪽(dp[i-1][j]) , 위쪽(dp[i][j-1]) 을 비교해서
        // [] []     [] []
        // [] []    [j-1] []
        // [] [i-1] [*] []
        // [] []    [] []
        // 더 큰 값인 곳으로 이동하게 만든다

        // 점화식
        // 단어가 같다면 str1[i] == str2[j]
        // LCS(i, j) = LCS(i-1,j-1) + 1
        // 단어가 다르다면 str1[i] != str2[j]
        // LCS(i, j) = Math.max(LCS(i-1, j) , LCS(i, j -1))
        // 위의 방식은 top-down 방식

        dp = new Integer[str1.length][str2.length];

        bw.write(String.valueOf(LCS(str1.length-1, str2.length-1)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int LCS(int i, int j) {

        // 인덱스 밖이라면 0 반환
        if (i == -1 || j == -1) {
            return 0;
        }

        // 탐색 하지 않은 부분이면 0으로 초기화
        if (dp[i][j] == null) {
            dp[i][j] = 0;

            // 같은 단어라면 이전 LCS 에서 +1
            if (str1[i] == str2[j]) {
                dp[i][j] = LCS(i - 1, j - 1) + 1;
            }

            // 다른 단어라면 dp[i-1][j] , do[i],[j -1] 중 큰 값으로
            else {

                dp[i][j] = Math.max(LCS(i - 1, j), LCS(i, j - 1));
            }
        }

        return dp[i][j];

    }

}
