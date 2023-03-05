class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            int cnt = 0;
            while (cnt < index) {
                while (skip.contains(String.valueOf(c))) {
                    if (c == 'z') {
                        c = 'a';
                    } else {
                        c++;
                    }
                }
                cnt++;
                if (c == 'z') {
                    c = 'a';
                    while (skip.contains(String.valueOf(c))) {
                        if (c == 'z') {
                            c = 'a';
                        } else {
                            c++;
                        }
                    }
                } else {
                    c++;
                    while (skip.contains(String.valueOf(c))) {
                        if (c == 'z') {
                            c = 'a';
                        } else {
                            c++;
                        }
                    }
                }
            }
            answer += c;
        }
        
        return answer;
    }
}
