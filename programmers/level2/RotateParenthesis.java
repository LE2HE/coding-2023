import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i=0;i<s.length();i++) {
            s = s.substring(1) + s.charAt(0);
            if (check(s)) answer++;
        }
        
        return answer;
    }
    
    static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
      
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') stack.push(s.charAt(i));
            else if (!stack.isEmpty()) {
                if (s.charAt(i) == ')' && stack.pop() == '(') continue;
                else if (s.charAt(i) == '}' && stack.pop() == '{') continue;
                else if (s.charAt(i) == ']' && stack.pop() == '[') continue;
                else return false;
            } 
            else return false;
        }
      
        if (stack.isEmpty()) return true;
        else return false;
    }
}
