class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for (int i=0;i<X.length();i++) {
            cntX[X.charAt(i)-'0']++;
        }
        for (int i=0;i<Y.length();i++) {
            cntY[Y.charAt(i)-'0']++;
        }
        for (int i=9;i>=0;i--) {
            for (int j=0;j<Math.min(cntX[i],cntY[i]);j++) {
                answer.append(i);
            }
        }
        
        if (answer.toString().equals("")) return "-1";
        if (answer.toString().charAt(0) == '0') return "0";
        return answer.toString();
    }
}
