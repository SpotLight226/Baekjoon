class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        String temp = new_id.toLowerCase(); // 1단계 : 대문자를 소문자로

        // 2단계 :알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외 모든 특수문자 제외
        // [ ] 안의 문자 제외하고 다 "" 로 치환
        temp = temp.replaceAll("[^-_.a-z0-9]", "");

        // 3단계 : 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        temp = temp.replaceAll("[.]{2,}", ".");

        // 4단계 : 마침표(.)가 처음이나 끝에 위치한다면 제거
        // ^ 시작 . or 끝 $ . 을 "'로 치환
        temp = temp.replaceAll("^[.]|[.]$", "");

        // 5단계 : 빈 문자열이라면, new_id에 "a"를 대입
        if(temp.equals("")) {
            temp += "a";
        }

        // 6단계 : 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        //         만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if(temp.length() >= 16){
            temp = temp.substring(0, 15); // 0 ~ 14 : 15개
            temp = temp.replaceAll("[.]$", ""); // $끝의 . 을 ""로 치환
        }

        // 7단계 : new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다
        if(temp.length() <= 2){
            while(temp.length() < 3){ // 문자열 길이가 3이되면 끝
                // 끝에 붙인다
                temp += temp.charAt(temp.length()-1); // 문자열의 마지막 문자의  인덱스 는 (길이 - 1) 
            }
        }
        
        answer = temp;
        return answer;
    }
}