import java.util.*;
class Solution {
    public static List<String> solution(String[] players, String[] callings) {

        HashMap<String, Integer> playerRank = new HashMap<>(); // 선수 해당 순위 맵
        HashMap<Integer, String> rankPlayer = new HashMap<>(); // 순위 해당 선수 맵

        for (int i = 0; i < players.length; i++) {
            // 각각 의 값을 입력
            playerRank.put(players[i], i + 1);
            rankPlayer.put(i + 1, players[i]);
        }

        for (String pass : callings) {
            int currentRank = playerRank.get(pass); // 현재 순위
            int frontRank = currentRank - 1; // 앞 순위

            String frontPlayer = rankPlayer.get(frontRank); // 앞 선수
            rankPlayer.put(frontRank, pass); // 지나간 선수의 순위 업데이트
            rankPlayer.put(currentRank, frontPlayer); // 제쳐진 선수 순위 업데이트
            // 선수 순위 맵 업데이트
            playerRank.put(pass, frontRank);
            playerRank.put(frontPlayer, currentRank);
        }

        return new ArrayList<>(rankPlayer.values());
    }
}