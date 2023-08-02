
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1); // 마지막 공백도 포함해서 자른다

        for(int i = 0 ; i < arr.length; i++){

            String[] split = arr[i].split("");
            for(int j = 0; j < split.length; j++){

                if(j%2 == 0){
                    split[j] = split[j].toUpperCase();
                } else {
                    split[j] = split[j].toLowerCase();
                }

                arr[i] = String.join("", split);
            }

        }
            return String.join(" ", arr);
    }
}