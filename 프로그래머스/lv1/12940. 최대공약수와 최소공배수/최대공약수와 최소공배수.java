class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(Math.max(n,m), Math.min(n,m));
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    int gcd(int n, int m){
        int r;
        while(m > 0){
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}