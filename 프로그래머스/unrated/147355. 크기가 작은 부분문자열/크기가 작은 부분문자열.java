class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int start = 0;
		int end = p.length();
		
		while(end <= t.length()) {
			long tmp = Long.parseLong(t.substring(start, end));
			
			if(tmp <= Long.parseLong(p)) {
				answer++;
			}
			
			start++;
			end++;
		}
        
        return answer;
    }
}