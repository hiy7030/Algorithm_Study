class Solution {
    public int[] solution(int[][] score) {
        double[] avg = new double[score.length];

        for(int i = 0; i < score.length; i++) {
            avg[i] = (double) (score[i][0] + score[i][1])/2;
        }

        int[] answer = new int[score.length];

        for(int i = 0; i < answer.length; i++) {
            int cnt = 1;
            for(int j = 0; j < answer.length; j++) {
                if(avg[j] > avg[i]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }
}