class Solution {
    public boolean solution(int x) {
        if(x%Integer.toString(x).chars().map(c -> c - '0').sum() == 0){
            return true;
        }else return false;        
    }
}