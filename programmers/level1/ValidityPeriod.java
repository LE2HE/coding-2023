import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0;i<terms.length;i++) {
            String[] str = terms[i].split(" ");
            map.put(str[0].charAt(0), Integer.parseInt(str[1]));
        }
        
        for (int i=0;i<privacies.length;i++) {
            char x = privacies[i].charAt(privacies[i].length()-1);
            int yy = Integer.parseInt(today.substring(0,4)) - Integer.parseInt(privacies[i].substring(0,4));
            int mm = Integer.parseInt(today.substring(5,7)) - Integer.parseInt(privacies[i].substring(5,7));
            int num = yy * 12 + mm;
            if (num > map.get(x)) {
                list.add(i+1);
            } else if (num == map.get(x)) {
                int dd = Integer.parseInt(today.substring(8,10)) - Integer.parseInt(privacies[i].substring(8,10));
                if (dd >= 0) {
                    list.add(i+1);
                } 
            }
        }
        
        answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
