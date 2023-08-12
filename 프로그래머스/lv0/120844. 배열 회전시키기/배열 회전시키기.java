class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        return result(numbers, direction);
    }
    
    public static int[] result(int[] numbers, String direction){

        int[] answer = new int[numbers.length];

        // left 일 때 : 매개변수 배열의 1번 인덱스부터 하나씩 앞으로 밀고, 마지막 인덱스에는 매개변수 배열의 첫 요소
        if(direction.equals("left")){
            for(int i = 0; i < numbers.length -1; i++){
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        // right 일 때 : 매개변수 배열의 0번 인덱스부터 하나씩 뒤로 당기고, 0 인덱스에 매개변수 배열의 마지막 요소
        } else {
            for(int i = 1; i < numbers.length; i++){
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[numbers.length -1];
        }

        return answer;
    }
}