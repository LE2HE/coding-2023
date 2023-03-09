class Solution {
    public long solution(int n) {
        long answer = 0;
        
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        long x = 1;
        long y = 2;
        for (int i=3;i<=n;i++) {
            answer = (x + y) % 1234567;
            x = y;
            y = answer;
        }
        
        return answer;
    }
}
