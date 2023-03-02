class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i=0;i<n;i++) {
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            String x = "";
            String y = "";
            for (int j=0;j<n-a.length();j++) {
                x += "0";
            }
            x += a;
            for (int j=0;j<n-b.length();j++) {
                y += "0";
            }
            y += b;
            answer[i] = "";
            for (int j=0;j<n;j++) {
                if (x.charAt(j) == '1' || y.charAt(j) == '1') {
                    answer[i] += '#';
                } else {
                    answer[i] += ' ';
                }
            }
        }
        
        return answer;
    }
}
