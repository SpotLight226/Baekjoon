import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[][] apt = new int[15][15]; // 0~14 범위 : 실제 사용은 1~14 001호, 002호 ...

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1; // 모든 아파트의 1호는 1이다 =  아래(a-1)층의 1호부터 b호까지 사람들의 수의 합
            apt[0][i] = i; // 0층 i호에는 i명이 산다
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        while (t > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(apt[k][n]);
            t--;
        }
    }
}