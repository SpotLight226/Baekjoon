class Solution {
    public int solution(int M, int N) {
        // 겹쳐서 자르는 것이 아닌 자르면 따로따로 자른다
        // return (M - 1) + (M * (N - 1));
        // M - 1 + M*N - M
        // M * N -1
        return M * N - 1;
    }
}