class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String s = dartResult;
        
        s = s.replace("*", "* ");
        s = s.replace("#", "# ");
        s = s.replace("S", " S ");
        s = s.replace("D", " D ");
        s = s.replace("T", " T ");
        String[] dart = s.split(" ");
        
        int[] n = new int[3];
        for (int i=0,count=-1;i<dart.length;i++) {
            if (dart[i].equals("S")) {
                n[count] = n[count];
            } else if (dart[i].equals("D")) {
                n[count] = n[count] * n[count];
            } else if (dart[i].equals("T")) {
                n[count] = n[count] * n[count] * n[count];
            } else if (dart[i].equals("*")) {
                if (count-1 >= 0) {
                    n[count-1] = n[count-1] * 2;
                    n[count] = n[count] * 2;
                } else {
                    n[count] = n[count] * 2;
                }
            } else if (dart[i].equals("#")) {
                n[count] = -n[count];
            } else {
                count++;
                n[count] = Integer.parseInt(dart[i]);
            }
        }
        
        for (int i=0;i<3;i++) {
            answer += n[i];
        }
        
        return answer;
    }
}
