class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length - (n - 1);
        int[] answer = new int[length];
        // System.arraycopy(복사할 배열, 시작 인덱스, 저장할 배열, 대상 배열의 저장 시작 인덱스, 복사할 개수)
        System.arraycopy(num_list, n - 1, answer, 0, length);
        return answer;
    }
}