class Solution {
    public int solution(int a, int b) {

        int answer = 0;

        int gcd = gcd(a, b); // 최대 공약수 구하기

        int denominator = b / gcd; // 분모를 최대 공약수로 나누어 기약분수 만들기

        int n = removeFactorsOf2And5(denominator); // 분모에서 2, 5 를 제거
        
        // n이 1이면 유한소수 이므로 1, 아니면 2
        return (n == 1) ? 1 : 2;
    }

    // 최대 공약수를 구하는 메서드(유클리드 호제법)
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // n에서 2, 5를 제거하는 메서드
    public int removeFactorsOf2And5(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return n;
    }
}