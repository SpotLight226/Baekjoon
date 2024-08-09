class Solution {
    public int solution(int[][] dots) {
        // 기울기 계산 => y2 - y1 / x2 - x1
        // 비교 가짓 수
        // x1, y1 와 x2, y2 vs x3, y3 와 x4, y4
        // x1, y1 와 x3, y3 vs x2, y2 와 x4, y4
        // x1, y1 와 x4, y4 vs x2, y2 와 x3, y3

        // 1번 조합: (x1, y1)와 (x2, y2) vs (x3, y3)와 (x4, y4)
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])) {
            return 1;
        }

        // 2번 조합: (x1, y1)와 (x3, y3) vs (x2, y2)와 (x4, y4)
        if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3])) {
            return 1;
        }

        // 3번 조합: (x1, y1)와 (x4, y4) vs (x2, y2)와 (x3, y3)
        if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) {
            return 1;
        }

        // 어떤 경우에도 평행하지 않다면 0 반환
        return 0;
    }

    public double getSlope(int[] p1, int[] p2) {
        return (double)(p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
}