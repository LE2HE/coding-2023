class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=0;i<n;i++) {
            int num = i;
            int sum = 0;
            while (sum < n) {
                num++;
                sum += num;
            }
            if (sum == n) answer++;
        }
        
        return answer;
    }
}
