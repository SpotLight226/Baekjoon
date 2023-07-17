import java.util.Comparator;
class Solution {
    public long solution(long n) {
        
        String str = Long.toString(n).chars().mapToObj(c -> Character.valueOf((char)c))
                         .sorted(Comparator.comparingInt(Character::valueOf).reversed())
                         .collect(StringBuilder::new, StringBuilder::appendCodePoint,
                                  StringBuilder::append).toString();
        return Long.parseLong(str);
    }
}