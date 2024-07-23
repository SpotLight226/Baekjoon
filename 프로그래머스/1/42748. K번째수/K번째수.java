import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        /*
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
        */
        
        // 위의 이중 for문을 쓸 필요 없이
        // 위의 이중 for문을 쓸 필요 없이
        for(int i = 0; i < commands.length; i++) {
            // commands는 이중 배열로 내부의 각 배열의 첫 요소는 시작점, 두 번째 요소는 끝 점이다
            // 위에선 각 commands의 각 줄을 뽑을 때 다 -1 했지만 copyOfRange의 특성을 사용해 시작점만 -1
            int[] copyArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyArr);
            // commands의 각 줄에서 가장 끝 요소가 선택 인덱스
            answer[i] = copyArr[commands[i][2]-1];
        }
        
        return answer;
    }
}