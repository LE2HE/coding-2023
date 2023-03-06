class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] str = s.split(" ");
        
        boolean flag = true;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                answer += " ";
                flag = true;
            }
            else if (flag == true) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    answer += (char)(s.charAt(i) - 32);
                }
                else {
                    answer += s.charAt(i);
                }
                flag = false;
            } else {
                answer += s.charAt(i);
            }
        }
        
        return answer;
    }
}
