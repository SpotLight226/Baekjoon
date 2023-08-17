class Solution {
    public int solution(String my_string) {
        return my_string.replaceAll("[a-zA-z]", "").chars().map(c -> c - '0').sum();
    }
}