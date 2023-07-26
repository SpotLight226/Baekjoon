import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        HashMap<String ,String> id = new HashMap<>();
        Arrays.stream(record).map(s -> s.split(" "))
              .filter(arr -> !arr[0].equals("Leave"))
              .forEach(arr -> id.put(arr[1], arr[2]));

        ArrayList<String> list = new ArrayList<>();
        Arrays.stream(record).map(s -> s.split(" "))
              .filter(arr -> !arr[0].equals("Change"))
              .forEach(arr -> {if(arr[0].equals("Enter")){
                                list.add(id.get(arr[1]) + "님이 들어왔습니다.");
                              } else {
                                list.add(id.get(arr[1]) + "님이 나갔습니다.");
                             }});
        
        String[] answer = new String[list.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}