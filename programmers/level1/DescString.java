import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        for (int i=1;i<c.length+1;i++) {
            answer += c[c.length-i];
        }
        
        return answer;
    }
}
