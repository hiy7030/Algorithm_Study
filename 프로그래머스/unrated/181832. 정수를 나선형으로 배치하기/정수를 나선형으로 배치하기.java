class Solution {
    public int[][] solution(int n) {
        // 오아왼위 순으로 반복 -> 배열의 끝이거나, 마주친 값이 0이 아닌 경우 방향을 바꾼다
        int[][] answer = new int[n][n];
        
        int row = 0;
        int col = 0;
        // 입력할 값
        int value = 1;
        // 방향 (오아왼위순으로 0,1,2,3)
        int dir = 0;
        
        while(value <= n*n) {
            answer[row][col] = value++;
            if(dir == 0) {
            // col값이 n-1보다 크거나, [row][col++] != 0
                if(col == n-1 || answer[row][col+1] != 0) {
                    dir = 1;
                    row++;
                } else {
                    col++;
                }
            } else if(dir == 1) {
                // row의 값이 n-1보다 크거나, [row++][col] != 0
                if(row == n-1 || answer[row+1][col] != 0) {
                    dir = 2;
                    col--;
                } else {
                    row++;
                }
            } else if(dir == 2) {
                // col의 값이 0보다 작거나, [row][col--] != 0
                if(col == 0 || answer[row][col-1] != 0) {
                    dir = 3;
                    row--;
                } else {
                    col--;
                }
                
            } else { // dir == 3
                // row <= 0 거나 [row--][col] != 0
                if(row == 0 || answer[row-1][col] != 0) {
                    dir = 0;
                    col++;
                } else{
                    row--;
                }
            }
        }
        
        return answer;
    }
}