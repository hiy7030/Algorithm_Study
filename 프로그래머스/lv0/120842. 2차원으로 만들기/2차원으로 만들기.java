class Solution {
    public int[][] solution(int[] num_list, int n) {
        // num_list의 길이를 n으로 나눈 값 : k [k][n]
        int k = num_list.length/n;
        
        int[][] answer = new int[k][n];
        int idx = 0;
   
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx];
                idx++;
            }
        }
        
        return answer;
    }
}