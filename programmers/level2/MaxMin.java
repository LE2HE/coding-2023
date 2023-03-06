class Solution {
    public String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");
        
        int min = Integer.parseInt(num[0]);
        int max = Integer.parseInt(num[0]);
        for (int i=1;i<num.length;i++) {
            int n = Integer.parseInt(num[i]);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        answer += min + " " + max;
        
        return answer;
    }
}
