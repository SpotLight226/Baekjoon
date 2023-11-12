import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int getSol(int start_row, int start_col, String[] board){
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"}; // white 체스판 정답지
        int white = 0;
        for(int i=0; i<8; i++){
            int row=start_row+i;
            for(int j=0; j<8; j++){
                int col=start_col+j;
                // 자른 체스판과 orgBoard가 같은지 비교
                if(board[row].charAt(col) != orgBoard[row%2].charAt(j)) white++; // 다르면 화이트 블록 하나 증가
            }
        }
        return Math.min(white, 64 - white); // white과 black의 값 중에서 더 작은 값 리턴
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String board[] = new String[n];

        for(int i=0; i<n; i++){
            board[i] = br.readLine();
        }

        int answer = Integer.MAX_VALUE;

        for(int i=0; i<=n-8; i++){ // 체스판을 8 X 8 로 쪼개기
            for(int j=0; j<=m-8; j++){

                int cnt = getSol(i, j, board); // i, j번째로부터 시작되는 체스판을 칠하는 최소 비용
                answer = Math.min(answer, cnt);
            }
        }
        System.out.println(answer);
    }
}