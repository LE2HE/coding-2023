import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if (cacheSize == 0) return cities.length * 5;
        
        Queue<String> cache = new LinkedList<>();
        
        for (int i=0;i<cities.length;i++) {
            String city = cities[i].toLowerCase();
            if (cache.contains(city)) {
                cache.remove(city);
                cache.offer(city);
                answer += 1;
            } else {
                if (cache.size() < cacheSize) {
                    cache.offer(city);
                } else {
                    cache.poll();
                    cache.offer(city);
                }
                answer += 5;
            }
        }
        
        return answer;
    }
}
