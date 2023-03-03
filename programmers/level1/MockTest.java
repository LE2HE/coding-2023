import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] cnt = {0, 0, 0};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i=0;i<answers.length;i++) {
            if (answers[i] == one[i % one.length]) cnt[0]++;
            if (answers[i] == two[i % two.length]) cnt[1]++;
            if (answers[i] == three[i % three.length]) cnt[2]++;
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        for (int i=0;i<3;i++) {
            if (max == cnt[i]) {
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(Number::intValue).toArray();
    }
}
