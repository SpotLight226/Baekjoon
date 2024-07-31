class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length; // 높이 (행)
        int w = park[0].length(); // 넓이 (열)

        char[][] arr = new char[h][w];
        int sx = 0;
        int sy = 0;

        // 시작 지점 설정
        for (int i = 0; i < h; i++) {
            arr[i] = park[i].toCharArray(); // park의 각 줄을 char 배열로 만들어 arr 행으로

            if (park[i].contains("S")) { // 시작 지점 설정
                sx = i; // S의 행
                sy = park[i].indexOf("S"); // S의 열
            }
        }

        // E, W, S, N 동서남북
        /*
          여기서 헷갈림 2차원 배열
          동 : 행에서 +1 (arr[][n + 1]) 
          서 : 행에서 -1 (arr[][n - 1])
          남 : 열에서 -1 (arr[n - ][])
          북 : 열에서 +1 (arr[n + 1][])
          
        */
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        String directions = "EWSN";

        for (String str : routes) {
            String[] temp = str.split(" "); // 명령 배열
            String op = temp[0]; // 방향
            int n = Integer.parseInt(temp[1]); // 이동 거리

            int dirIndex = directions.indexOf(op); // directions에서의 인덱스
            // 이동하는 좌표
            int nx = sx; 
            int ny = sy;
            boolean check = true; // 이동 가능한지 확인하는 boolean

            for (int i = 0; i < n; i++) {
                // directions에서의 인덱스를 이용하여 dx 배열의 값으로 계산
                nx += dx[dirIndex]; 
                ny += dy[dirIndex];

                // 이동 범위 체크 및 장애물 확인
                // nx, ny 가 범위를 벗어나는지, arr배열에서 X인지 확인
                if (nx < 0 || ny < 0 || nx >= h || ny >= w || arr[nx][ny] == 'X') {
                    check = false;
                    break;
                }
            }

            // 유효한 이동인 경우 위치 갱신
            if (check) {
                sx = nx;
                sy = ny;
            }
        }

        return new int[]{sx, sy};
    }
}