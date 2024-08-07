class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();

        String[] arr = polynomial.split(" ");

        int x = 0; // x 의 계수
        int n = 0; // 일반 숫자의 값

        for (String str : arr) {
            if (str.contains("x")) { // x가 있을 때
                if (str.length() > 1) { // 만약 길이가 1보다 크다면 앞에 숫자가 있는 것
                    x += Integer.parseInt(str.replace("x", "")); // str 의 x를 ""으로 변경 후 x 값에
                } else {
                    x++; // 길이가 1 이면 그냥 x 라는 뜻이므로 +1
                }
            } else if (!str.equals("+")) { // str이 x를 포함하고 있지 않고, + 가 아니라면
                n += Integer.parseInt(str); // n에 더하기
            }


        }

        if (x > 0) { // x 값이 있다면
            sb.append(x == 1 ? "x" : x + "x"); // x가 1이면 "x" 만, 아니면 계수x 를 sb에
        }

        if (n > 0) { // 일반 숫자가 있다면
            if (sb.length() > 0) { // sb 길이가 0보다 길다면 앞에 x가 있다는 뜻
                sb.append(" + "); // + 를 추가
            }
            sb.append(n);
        }
        return sb.toString().trim(); // 불필요한 공백 제거 후 반환
    }
}