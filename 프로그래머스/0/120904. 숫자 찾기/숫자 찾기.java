class Solution {
    public int solution(int num, int k) {
        /*
        int answer = -1;
        
        String[] arr = String.valueOf(num).split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(String.valueOf(k))) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
        */
        
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int answer = numStr.indexOf(kStr);
        
        // answer 이 0보다 작다는 것은 없다는 것 그래서 - 1 반환 있다면 index + 1
        return answer < 0 ? -1 : answer + 1;
    }
}