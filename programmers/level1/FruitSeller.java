import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        int min = score[score.length-1];
        for (int i=score.length-1;i>=0;i--) {
            min = Math.min(min, score[i]);
            if ((score.length-i) % m == 0) {
                answer += min * m;
            }
        }
        
        return answer;
    }
}
