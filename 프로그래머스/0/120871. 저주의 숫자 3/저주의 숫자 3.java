class Solution {
    public int solution(int n) {
        /*
        // 미리 3x 마을의 숫자를 계산해둔 arr 배열을 만들어 푸는 방식
        int[] arr = new int[101];  // 101 크기의 배열을 선언합니다.
        int x = 1;  // 3x 마을의 숫자를 시작합니다.
        int index = 1;  // 배열의 인덱스를 1부터 시작합니다.

        while (index < 101) {
            // x가 3의 배수이거나 숫자 3을 포함하면 건너뜁니다.
            if (x % 3 == 0 || String.valueOf(x).contains("3")) {
                x++;
                continue;
            }
            arr[index] = x;  // 배열에 x 값을 저장합니다.
            x++;  // x 값을 증가시킵니다.
            index++;  // 다음 인덱스로 이동합니다.
        }
        
        return arr[n];
        */
        // for문으로 answer의 값을 계산하여 3의 배수 또는 answer에 3이 포함되어 있으면 i 를 -1해서
        // 반복문이 더 돌아갈 수 있게 한다 
        // 이 방법 좋은듯
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }
}