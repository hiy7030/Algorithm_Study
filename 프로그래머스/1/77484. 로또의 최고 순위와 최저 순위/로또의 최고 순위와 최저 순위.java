class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        for(int i = 0; i < lottos.length; i++) {
            int num = lottos[i];
            if(num == 0) {
                answer[0]++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++) {
                if(num == win_nums[j]) {
                    answer[0]++;
                    answer[1]++;
                    break;
                }
            }
        }
        // 최고-최저 순
        for(int i = 0; i < answer.length; i++) {
            switch (answer[i]) {
                case 6 : answer[i] = 1; break;
                case 5 : answer[i] = 2; break;
                case 4 : answer[i] = 3; break;
                case 3 : answer[i] = 4; break;
                case 2 : answer[i] = 5; break;
                default: answer[i] = 6; break;
            }
        }
        return answer;
    }
}