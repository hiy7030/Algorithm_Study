class Solution {
    public int[] solution(String[] keyinput, int[] board) {
// board의 크기
        int xLen = (board[0]-1)/2;
        int yLen = (board[1]-1)/2;
        // x의 범위 : -xLen ~ xlen, y의 범위 : -yLen ~ yLen
        int[] answer = new int[2];

        for(int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up" : if(answer[1] < yLen) answer[1]++; break;
                case "down" : if(answer[1] > -yLen) answer[1]--; break;
                case "left" : if(answer[0] > -xLen) answer[0]--; break;
                case "right" : if(answer[0] < xLen) answer[0]++; break;
            }
        }
        return answer;
    }
}