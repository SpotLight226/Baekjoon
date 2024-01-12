import java.io.*;
import java.util.*;

class Main{

    static int k;
    static int[] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());

            k = Integer.parseInt(st.nextToken());

            if(k ==0) break;

            arr = new int[k];
            check = new boolean[k];

            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            System.out.println();
        }
    }

    static void dfs(int depth, int start) {
        if (depth == 6) {
            for (int i = 0; i < k; i++) {
                if (check[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
        for (int i = start; i < k; i++) {
            check[i] = true; // 중복 방지위해 true로
            dfs(depth + 1, i + 1); // 다음 dfs 호출
            check[i] = false; // 다음을 false로
        }
    }
}





