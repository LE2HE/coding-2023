class Solution {
    public int solution(int n) {
        int answer = 0;
        int len = 1;
        int num = n;
        while (num/3 > 0) {
            num /= 3;
            len++;
        }
        
        for (int i=1;i<=len;i++) {
            answer += (n % 3) * Math.pow(3, len-i);
            n /= 3;
        }
        
        return answer;
    }
}
