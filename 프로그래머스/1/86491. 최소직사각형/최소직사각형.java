class Solution {
        public int solution(int[][] sizes) {
        int max_x = 0;
        int max_y = 0;
            
        for(int i = 0; i < sizes.length; i++) {
            int x = Math.max(sizes[i][0], sizes[i][1]); // 가장 긴 길이 (가로)
            int y = Math.min(sizes[i][0], sizes[i][1]); // 가장 짧은 길이 (세로)
            
            max_x = Math.max(max_x, x); // 가장 긴 길이의 최대
            max_y = Math.max(max_y, y); // 가장 짧은 길이의 최대
        }    
            
        return max_x * max_y;
    }
}