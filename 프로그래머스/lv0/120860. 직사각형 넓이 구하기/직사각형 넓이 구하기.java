class Solution {
    public int solution(int[][] dots) {
        // 직사각형 x1, x2 y1, y2
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = 0;
        int y2 = 0;
        
        for(int i = 1; i < dots.length; i++) {
            if(dots[i][0] != x1) x2 = dots[i][0];
            if(dots[i][1] != y1) y2 = dots[i][1]; 
        }
        
        int x = Math.abs(x1-x2);
        int y = Math.abs(y1-y2);
        
        int answer = x * y;
        return answer;
    }
}