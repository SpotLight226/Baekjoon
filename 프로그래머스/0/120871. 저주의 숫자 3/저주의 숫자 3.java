class Solution {
    public int solution(int n) {
        int[] arr = new int[101];  // 100 크기의 배열을 선언합니다.
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
    }
}