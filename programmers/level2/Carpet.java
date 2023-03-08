class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int i=1;i<=yellow;i++) {
            if (yellow % i == 0) {
                if ((i + yellow / i) * 2 + 4 == brown) {
                    answer[0] = Math.max(i, yellow / i) + 2;
                    answer[1] = Math.min(i, yellow / i) + 2;
                }
            }
        }
        
        return answer;
    }
}
