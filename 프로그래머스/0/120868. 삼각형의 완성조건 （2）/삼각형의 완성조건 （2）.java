class Solution {
    public int solution(int[] sides) {
        int maxLen = Math.max(sides[0], sides[1]);
        int minLen = Math.min(sides[0], sides[1]);

        // 삼각형 조건
        /* 1, 가장 긴 변이 maxLen 이라면
             가능한 세 번째 변 c의 범위는 maxLen - minLen + 1 ~ maxLen 까지
             즉, maxLen - (maxLen - minLen + 1) + 1 => minLen
           2. 세 번째 변이 가장 긴 변이 된다면
             가능한 세 번째 변 c 의 범위는 maxLen + 1 ~ maxLen + minLen + 1 까지
             즉, 개수는 (minLen + maxLen - 1) - maxLen => minLen - 1
        */
        int count1 = minLen;

        int count2 = minLen - 1;

        return count1 + count2;
    }
}