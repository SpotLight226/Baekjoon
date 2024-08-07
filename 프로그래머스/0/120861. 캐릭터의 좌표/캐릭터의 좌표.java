class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        // 최대 이동 가능 범위
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;

        for (String order : keyinput) {
            // 각 명령에 따라 범위를 확인하고 계산
            switch (order) {
                case "up": // 위
                    if(y < maxY) y++;
                    break; 
                case "down": // 아래
                    if(y > -maxY) y--;
                    break;
                case "left": // 왼쪾
                    if(x > -maxX) x--;
                    break;
                case "right": // 오른쪽
                    if(x < maxX) x++;
                    break;
            }
        }

        return new int[]{x, y};
    }
}