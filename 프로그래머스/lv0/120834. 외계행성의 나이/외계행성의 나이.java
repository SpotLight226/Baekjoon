import java.util.ArrayList;
class Solution {
    public String solution(int age) {
        ArrayList<Integer> list = new ArrayList<>();

        while(age > 0){
            list.add(age%10);
            age /= 10;
        }

        String answer = "";
        for(int i = list.size()-1; i >= 0; i--){
            answer += (char) (list.get(i) + 97);
        }
        
        return answer;
    }
}