import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {        
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0;i<speeds.length;i++) {
            int n = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            queue.add(n);
        }
        
        int cnt = 1;
        int day = queue.poll();
        while (true) {
            if (queue.isEmpty()) {
                list.add(cnt);
                break;
            }
            if (day >= queue.peek()) {
                queue.poll();
                cnt++;
            } else {
                list.add(cnt);
                day = queue.poll();
                cnt = 1;
            }
        }
        
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}
