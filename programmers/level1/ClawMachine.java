import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack stack = new Stack();
        
        for (int i=0;i<moves.length;i++) {
            for (int j=0;j<board.length;j++) {
                if (board[j][moves[i]-1] == 0) continue;
                else {
                    if (!stack.isEmpty() && (int)stack.peek() == board[j][moves[i]-1]) {
                        answer = answer + 2;
                        stack.pop();
                        board[j][moves[i]-1] = 0;
                        break;
                    } else {
                        stack.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }
            }
            System.out.println("");
        }
        
        return answer;
    }
}
