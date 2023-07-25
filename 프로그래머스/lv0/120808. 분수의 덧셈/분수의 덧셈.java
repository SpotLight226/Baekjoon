class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        // 분모는 분모끼리
        int denom = denom1 * denom2;
        
        // 분자와 분모의 최대 공약수
        for(int i = numer - 1; i > 1; i--){
            if(numer % i == 0 && denom % i == 0){
                numer /= i;
                denom /= i;
            }
        }
        int[] answer = {numer, denom};
        return answer;
    }
}