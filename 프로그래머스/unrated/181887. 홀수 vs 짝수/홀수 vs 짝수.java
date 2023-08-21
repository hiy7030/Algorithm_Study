class Solution {
    public int solution(int[] num_list) {
        // 0번 2번 -> 홀수(even)
        // 1 3 -> 짝수 취급하기(odd)
        int odd = 0;
        int even = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        
        int answer = 0;
        answer = Math.max(odd, even);
        
        return answer;
    }
}