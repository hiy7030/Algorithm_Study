class Solution {
    public int solution(int[][] board) {
        // 지뢰를 표시할 새 배열을 선언해서... 비안전지역을 표시? -> 크기는 board +2
        int[][] safe = new int[board.length+2][board.length+2];
        // board에서 값이 1인 수를 찾아서 safe의 값을 변경 board[i][i]-> safe[i+1][i+1]
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    // x y
                    safe[i+1][j+1] = 1;
                    // x-1 y
                    safe[i][j+1] = 1;
                    // x+1 y
                    safe[i+2][j+1] = 1;
                    // x-1 y-1
                    safe[i][j] = 1;
                    // x y-1
                    safe[i+1][j] = 1;
                    // x+1 y-1
                    safe[i+2][j] = 1;
                    // x-1 y+1
                    safe[i][j+2] = 1;
                    // x y+1
                    safe[i+1][j+2] = 1;
                    // x+1 y+1
                    safe[i+2][j+2] = 1;
                }
            }
        }
        int answer = 0;
        for(int i = 1; i < safe.length-1; i++) {
            for(int j = 1; j < safe.length-1; j++) {
                if(safe[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}