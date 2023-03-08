class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i=1;i<arr.length;i++) {
            answer = lcm(arr[i], answer);
        }
        
        return answer;
    }
    
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
    
}
