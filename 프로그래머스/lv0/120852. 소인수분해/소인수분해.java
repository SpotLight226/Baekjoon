import java.util.HashSet;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2; i<= n; i++){
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if(n != 1) set.add(n);
        
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}