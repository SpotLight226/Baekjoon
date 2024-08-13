class Solution {
    public int solution(int[] common) {
         int len = common.length;
        // 등비, 등차를 판단하기 위해서 
        // 0, 1, 2 항의 값의 차를 확인한다
        if (common[1] - common[0] == common[2] - common[1]) { // 등차
            return common[len - 1] + common[1] - common[0];
        } else { // 등비
            return common[len - 1] * (common[1] / common[0]);
        }
    }
}