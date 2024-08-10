import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        //Comparator을 사용하기 위해서 Integer 배열로 변환
        Integer[] integerArr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 각 숫자의 차이
                int diff1 = Math.abs(o1 - n);
                int diff2 = Math.abs(o2 - n);
                
                // 차이가 같다면
                if (diff1 == diff2) {
                    return o2 - o1; // 큰 것을 앞으로
                } else { // 차이가 다르면
                    return diff1 - diff2; // 차이로 정렬 
                }
            }
        };
        
        // Comparator 을 사용해서 정렬
        Arrays.sort(integerArr, com);

        return Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray(); // int[] 을 리턴
    }
}