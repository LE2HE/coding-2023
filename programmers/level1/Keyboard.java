class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i=0;i<targets.length;i++) {
            for (int j=0;j<targets[i].length();j++) {
                char c = targets[i].charAt(j);
                int min = 101;
                for (int k=0;k<keymap.length;k++) {
                    for (int l=0;l<keymap[k].length();l++) {
                        if (targets[i].charAt(j) == keymap[k].charAt(l)) {
                            min = Math.min(min, l);
                            break;
                        }
                    }
                }
                if (min == 101) {
                    answer[i] = -1;
                    break;
                }
                else answer[i] += min + 1;
            }
        }
        return answer;
    }
}
