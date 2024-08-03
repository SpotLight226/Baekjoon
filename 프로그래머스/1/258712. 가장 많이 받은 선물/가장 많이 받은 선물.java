import java.util.*;
class Solution {
    public static int solution(String[] friends, String[] gifts) {

        int n = friends.length;

        HashMap<String, Integer> hashMap = new HashMap<>();

        // 친구 이름으로 인덱스 맵핑
        for (int i = 0; i < n; i++) {
            hashMap.put(friends[i], i);
        }

        int[] giftIndex = new int[n]; // 선물 지수 배열
        int[][] arr = new int[n][n]; // 주고 받은 선물 횟수 저장 배열

        for (String str : gifts) {
            String[] temp = str.split(" ");
            int giver = hashMap.get(temp[0]); // 준 사람
            int receiver = hashMap.get(temp[1]); // 받은 사람

            // 준 사람 받은 사람 선물 지수 갱신
            giftIndex[giver]++;
            giftIndex[receiver]--;

            arr[giver][receiver]++; // 주고 받은 횟수 증가
        }

        int maxGifts = 0;

        for (int i = 0; i < n; i++) {
            int received = 0; // 각 사람당 받을 개수

            for (int j = 0; j < n; j++) {
                if(i == j ) continue; // 해당 사람이면 넘기기

                // 선물 횟수 확인해서 더 많이 줬다면 선물 받기
                if (arr[i][j] > arr[j][i]) {
                    received++;
                } 
                // 선물 횟수가 동일하거나 없다면, 선물 지수 확인해서 선물 받기
                else if (arr[i][j] == arr[j][i] && giftIndex[i] > giftIndex[j]) {
                    received++;
                }
            }

            maxGifts = Math.max(maxGifts, received);
        }

        return maxGifts;
    }
}