import java.util.*;
class Solution {
    public int solution(int[][] board) {
        /*
        // set 을 사용해서 중복을 제거한 위험 지역 표시 및 계산
        int len = board.length;

        // 위, 아래, 좌, 우, 좌 대각선 위 , 좌 대각선 아래, 우 대각선 위, 우 대각선 아래,
        int[] dangerX = {1, -1, 0, 0, 1, -1, 1, -1};
        int[] dangerY = {0, 0, 1, -1, 1, 1, -1, -1};

        // 위험 지역을 저장할 Set
        Set<String> dangerZone = new HashSet<>();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {
                    // 현재 지뢰 위치를 위험 지역으로 표시
                    dangerZone.add(i + "," + j);

                    // 8방향을 체크하여 위험 지역 표시
                    for (int z = 0; z < 8; z++) {
                        int xRange = i + dangerX[z];
                        int yRange = j + dangerY[z];

                        // 범위를 벗어나는 경우 제외
                        if (xRange >= 0 && xRange < len && yRange >= 0 && yRange < len) {
                            dangerZone.add(xRange + "," + yRange);
                        }
                    }
                }
            }
        }

        // 전체 칸 수에서 위험 지역 칸 수를 빼서 안전한 지역의 칸 수 계산
        int totalCells = len * len;
        int answer = totalCells - dangerZone.size();

        return answer;
        */
        // 위험지역 체크를 통한 정석
        int len = board.length;

        // 위, 아래, 좌, 우, 좌 대각선 위 , 좌 대각선 아래, 우 대각선 위, 우 대각선 아래,
        int[] dangerX = {1, -1, 0, 0, 1, -1, 1, -1};
        int[] dangerY = {0, 0, 1, -1, 1, 1, -1, -1};

        boolean[][] dangerZone = new boolean[len][len]; // 위험지역 체크

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 1) {

                    dangerZone[i][j] = true; // 위험지역

                    for (int z = 0; z < 8; z++) {
                        int xRange = i + dangerX[z];
                        int yRange = j + dangerY[z];
                        // 범위 확인후 위험지역으로
                        if (xRange >= 0 && xRange < len && yRange >= 0 && yRange < len) {
                            dangerZone[xRange][yRange] = true;
                        }
                    }
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(!dangerZone[i][j]) answer++; // 위험지역이 아니라면 answer + 1
            }
        }

        return answer;
    }
}