import java.util.*;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> dbHash = new HashMap<>();

        for (String[] entry : db) {
            dbHash.put(entry[0], entry[1]);
        }

        String id = id_pw[0];
        String pw = id_pw[1];

        if (dbHash.containsKey(id)) { // 아이디가 db에 존재할 때
            if (dbHash.get(id).equals(pw)) { // 아이디가 존재하며 pw가 동일할 때
                return "login";
            } else { // 아이디는 존재하지 pw가 동일하지 않을 때
                return "wrong pw";
            }
        }

        return "fail"; //아이디가 db에 존재하지 않으면
    }
}