import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2; // 중복이 없다면 최대로 고를 수 있는 것은 nums 길이의 반이다
        
        HashSet<Integer> hashSet = new HashSet<>(); // 중복 제거위한 해쉬 셋
        
        for(int n : nums){
            hashSet.add(n);
        }
        
        // 해쉬 셋의 사이즈(중복이 제거된 수의 개수)가 맥스보다 크다면 max 리턴, 작다면 size 리턴
        return hashSet.size() > max ? max : hashSet.size();
    }
}