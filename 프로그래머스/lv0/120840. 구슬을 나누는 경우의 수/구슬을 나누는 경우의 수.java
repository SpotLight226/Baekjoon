class Solution {
    public int solution(int balls, int share) {
        return result(balls, share);
    }
    
    public int result(int balls, int share){
        if(balls == share || share == 0) return 1;
        return result((balls - 1), (share - 1)) + result(balls - 1, share);
    }
}