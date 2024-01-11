import java.io.*;
import java.util.*;

class Main{

    static int[][] arr = new int[101][101]; // 100 * 100 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            Square(x1, y1, x2, y2);
        }

        br.close();

        int range = 0;

        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                range += arr[i][j];
            }
        }

        bw.write(String.valueOf(range));
        bw.flush();
        bw.close();
    }

    // 사각형을 저장하는 메서드
    // 2차원 배열로 2중 for문을 이용해 x,y 좌표를 1로 만든다
    public static void Square(int x1, int y1, int x2, int y2) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                // 이미 1 이라면 스킵
                if(arr[i][j] == 1) {
                    continue;
                }else {
                    arr[i][j] = 1;
                }
            }
        }
    }

}





