import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);
        char c = words[0].charAt(words[0].length()-1);
        for (int i=1;i<words.length;i++) {
            if (c != words[i].charAt(0) || list.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            list.add(words[i]);
            c = words[i].charAt(words[i].length()-1);
        }
        
        return answer;
    }
}
