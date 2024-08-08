import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell 을 정렬
        Arrays.sort(spell);
        String sortedSpell = "";

        // 정렬된 spell 을 하나의 문장으로 만든다
        for (int i = 0; i < spell.length; i++) {
            sortedSpell += spell[i];
        }

        for (String word : dic) {
            String[] temp = word.split(""); // 문자를 정렬하기 위해 split

            Arrays.sort(temp); // 정렬

            // 정렬된 word 를 하나의 문장으로 만든다
            String sortedWord = "";
            for (int i = 0; i < temp.length; i++) {
                sortedWord += temp[i];
            }

            // 정렬된 spell 과 정렬된 word 가 같다면 한번씩만 사용한 문자가 있다는 뜻이므로  return 1
            if (sortedSpell.equals(sortedWord)) {
                return 1;
            }
        }

        return 2;
    }
}