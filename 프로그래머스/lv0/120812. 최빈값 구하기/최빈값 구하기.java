import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        // 정렬 후 가장 뒤의 수를 가장 큰 수로
        Arrays.sort(array);
        max = array[array.length -1];
        
        // 각 요소의 개수를 저장할 배열
        int[] count = new int[max+1];
        for(int i : array){
            count[i]++;
        }

        max = count[0];
        
        for(int i = 1; i<count.length; i++){
            // 가장 많은 개수보다 기수 배열의 요소가 크다면
            if(max < count[i]){
                // 가장 큰 수를 기수 배열 요소로
                max = count[i];
                // 개수 배열의 인덱스를 결과로
                answer = i;
            // 가장 많은 개수 와 기수 배열 요소가 같다면
            } else if (max == count[i]) {
                // answer을 -1로
                answer = -1;
            }
        }
        return answer;
    }
}