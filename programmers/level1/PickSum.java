import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> num = new HashSet<>();
        
        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<numbers.length;j++) {
                if (j == i) continue;
                num.add(numbers[i] + numbers[j]);
            }
        }
        
        return num.stream().sorted().mapToInt(Number::intValue).toArray();
    }
}
