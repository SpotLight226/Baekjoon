class Solution {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);
        
        // sqrt 를 int로 변환한 값과 같다면
        if(sqrt == sqrt.intValue()){
            // x + 1 의 제곱을 리턴
            return (long)Math.pow(sqrt + 1, 2);
        } else {
            return -1;
        }
    }
}