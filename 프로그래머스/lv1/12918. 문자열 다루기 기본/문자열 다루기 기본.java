class Solution {
    public boolean solution(String s) {
        
        int count = (int) s.chars().count();
        
        if(count == 4 || count == 6){
            int sum = s.chars().filter(c -> c > 57 || c < 48).sum();
            return sum > 0 ? false : true;
        }
        return false;
    }   
}