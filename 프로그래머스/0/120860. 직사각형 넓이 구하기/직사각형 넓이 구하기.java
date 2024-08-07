class Solution {
    public int solution(int[][] dots) {
        // 직사각형 넓이 구하려면 X, Y의 최대, 최소값을 찾아 가로 세로 길이 계산하면 됨
        int minX = Integer.MAX_VALUE; // 가장 작은 x좌표
        int maxX = Integer.MIN_VALUE; // 가장 큰 x좌표
        int minY = Integer.MAX_VALUE; // 가장 작은 y좌표
        int maxY = Integer.MIN_VALUE; // 가장 큰 y좌표

        for (int[] dot : dots) {
            int x = dot[0]; // x 좌표
            int y = dot[1]; // y 좌표
            
            // 각 조건에 따라 최대, 최소 X,Y 좌표를 구함
            if(x < minX) minX = x;
            if(x > maxX) maxX = x;
            if(y < minY) minY = y;
            if(y > maxY) maxY = y;
        }
 
        int width = maxX - minX; // 가로
        int height = maxY - minY; // 세로
        
        return width * height; // 넓이
    }
}