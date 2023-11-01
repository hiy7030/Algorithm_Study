import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        //board[i][j] -> j가 moves의 번호
        for(int move : moves) {
            for(int i = 0; i < board.length; i++) {
                int tmp = board[i][move-1];
                board[i][move-1] = 0;
                if(tmp != 0) {
                    if(!stack.isEmpty() && stack.peek() != tmp) {
                        stack.push(tmp);
                    } else {
                        stack.pop();
                        cnt+=2;
                    }
                    break;
                }
            }
        }
        return cnt;
    }
}