import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        for (int i=0;i<id_list.length;i++) {
            map.put(id_list[i], new HashSet<>());
        }
        
        for (int i=0;i<report.length;i++) {
            String[] str = report[i].split(" ");
            map.get(str[1]).add(str[0]);
        }
        
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = String.valueOf(it.next());
            if (map.get(key).size() >= k) {
                for (int i=0;i<id_list.length;i++) {
                    if (map.get(key).contains(id_list[i])) answer[i]++;
                }
            }
        }
        
        
        return answer;
    }
}
