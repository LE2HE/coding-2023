class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] cnt = new int[N+1];
        double[] fail = new double[N];
        for (int i=0;i<stages.length;i++) {
            if (stages[i] == N+1) continue;
            cnt[stages[i]-1]++;
        }
        int sum = 0;
        for (int i=0;i<fail.length;i++) {
            answer[i] = i+1;
            fail[i] = (double)cnt[i] / (double)(stages.length-sum);
            System.out.println(fail[i]);
            sum += cnt[i];   
        }
        double tmp;
        int n;
        for (int i=0;i<N-1;i++) {
            for (int j=0;j<N-i-1;j++) {
                if (fail[j] < fail[j+1]) {
                    tmp = fail[j];
                    fail[j] = fail[j+1];
                    fail[j+1] = tmp;
                    n = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = n;
                }
            }
        }
        
        return answer;
    }
}
