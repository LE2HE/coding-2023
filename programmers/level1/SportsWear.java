import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] num = new int[n];
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i=0;i<lost.length;i++) {
            num[lost[i]-1]--;
        }
        for (int i=0;i<reserve.length;i++) {
            num[reserve[i]-1]++;
        }
        
        for (int i=0;i<n;i++) {
            if (num[i] == -1) {
                if (i > 0 && num[i-1] == 1) {
                    num[i-1]--;
                    num[i]++;
                } else if (i < n-1 && num[i+1] == 1) {
                    num[i+1]--;
                    num[i]++;
                }
            }
            if (num[i] >= 0) answer++;
        }
        return answer;
    }
}
