class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toBinaryString(n).replace("0", "");
        while (true) {
            n++;
            String s = Integer.toBinaryString(n).replace("0", "");
            if (s.length() == str.length()) break;
        }
        answer = n;
        
        return answer;
    }
}
