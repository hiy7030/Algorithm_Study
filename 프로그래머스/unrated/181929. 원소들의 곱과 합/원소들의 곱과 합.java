class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 모든 원소들의 곱 < (모든 원소들의 합^2) = 1
        int multi = 1;
        int pow = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            multi *= num;
            pow += num;
        }
        
        pow = (int)Math.pow(pow, 2);
        
        if(multi < pow) answer = 1;
        
        return answer;
    }
}