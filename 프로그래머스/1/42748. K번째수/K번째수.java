import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {

            int[] com = new int[3]; // 각 command
            
            // 하나의 command를 빼낸다, 인덱스로 쓰기 위해서 -1
            for (int j = 0; j < 3; j++) {
                com[j] = commands[i][j] - 1; 
            }
            
            // array 배열을 복사하는데 com[0] 부터 com[1] + 1(배열 복사 시 to Index는 포함 안됨)
            int[] copyArr = Arrays.copyOfRange(array, com[0], com[1] + 1);

            Arrays.sort(copyArr); // 정렬

            answer[i] = copyArr[com[2]]; // 정답 배열에 정렬된 copyArr의 해당 인덱스 숫자를 넣는다
        }
        
        
        return answer;
    }
}