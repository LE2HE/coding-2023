class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        
        for (int i=0;i<c.length;i++) {
            if (c[i] == ' ') answer += ' ';
            else if (c[i] >= 'A' && c[i] <= 'Z') {
                if (c[i] + n > 'Z') {
                    answer += (char)(c[i] + n - 26);
                } else {
                    answer += (char)(c[i] + n);
                }
            } else if (c[i] >= 'a' && c[i] <= 'z') {
                if (c[i] + n > 'z') {
                    answer += (char)(c[i] + n - 26);
                } else {
                    answer += (char)(c[i] + n);
                }
            }
        }
        return answer;
    }
}
