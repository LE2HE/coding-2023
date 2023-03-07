class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int x = 0;
        int y = 1;
        for (int i=2;i<=n;i++) {
            answer = (x + y) % 1234567;
            x = y;
            y = answer;
        }
        
        return answer;
    }
    
}
