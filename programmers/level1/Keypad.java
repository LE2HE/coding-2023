class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int l = 10, r = 12;
        for (int i=0;i<numbers.length;i++) {
            if (numbers[i] == 0) numbers[i] = 11; 
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                l = numbers[i];
            }
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                r = numbers[i];
            }
            else {
                if (l == 0) l = 11;
                if (r == 0) r = 11;
                int dl = Math.abs(numbers[i] - l) / 3 + Math.abs(numbers[i] - l) % 3;
                int dr = Math.abs(numbers[i] - r) / 3 + Math.abs(numbers[i] - r) % 3;
                if (dl == dr) {
                    if (hand.equals("left")) {
                        answer += "L";
                        l = numbers[i];
                    } else {
                        answer += "R";
                        r = numbers[i];
                    }
                } else if (dl < dr) {
                    answer += "L";
                    l = numbers[i];
                } else {
                    answer += "R";
                    r = numbers[i];
                }
            }
        }
        
        return answer;
    }
}
