import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        String tmp = "";
        
        for (int i=0;i<strings.length-1;i++) {
            for (int j=0;j<strings.length-i-1;j++) {
                if (strings[j].charAt(n) == strings[j+1].charAt(n)) {
                    if (strings[j].compareTo(strings[j+1]) > 0) {
                        tmp = answer[j];
                        answer[j] = answer[j+1];
                        answer[j+1] = tmp;
                    }
                }
                else if (strings[j].charAt(n) > strings[j+1].charAt(n)) {
                    tmp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tmp;
                }
            }
        }
        
        return answer;
    }
}
