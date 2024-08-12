class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k);

        // i부터 j까지의 숫자에서 k가 몇 번 등장하는지 계산
        for (int n = i; n <= j; n++) {
            String numStr = String.valueOf(n);
            for (int l = 0; l < numStr.length(); l++) {
                if (numStr.charAt(l) == kStr.charAt(0)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}