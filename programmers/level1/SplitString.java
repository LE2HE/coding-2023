class Solution {
    public int solution(String s) {
        int answer = 0;
        int cntX = 0;
        int cntY = 0;
        
        char x = 0;
        for (int i=0;i<s.length();i++) {
            if (cntX == 0 && cntY == 0) {
                x = s.charAt(i);
                cntX++;
            }
            else if (s.charAt(i) == x) {
                cntX++;
            } else {
                cntY++;
            }
            if (cntX == cntY) {
                answer++;
                cntX = 0;
                cntY = 0;
            } else {
                if (i == s.length()-1) answer++;    
            }
        }
        
        return answer;
    }
}
