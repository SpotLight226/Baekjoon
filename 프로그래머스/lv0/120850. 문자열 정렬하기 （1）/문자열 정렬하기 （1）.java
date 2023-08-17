class Solution {
    public int[] solution(String my_string) {
        
        return my_string.replaceAll("[a-z]", "").chars().sorted().map(c -> c -'0').toArray();
    }
}