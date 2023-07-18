class Solution {
    public String solution(String phone_number) {
        // phone_number 를 character 배열로 만든다
        char[] arr = phone_number.toCharArray();
        
        // arr의 길이 -4 까지 배열을 *로 변경
        for(int i = 0; i < arr.length-4; i++){
            arr[i] = '*';
        }
        
        return String.valueOf(arr);
    }
}