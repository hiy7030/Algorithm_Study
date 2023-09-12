class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            char[] num = String.valueOf(array[i]).toCharArray();
            for(char c : num) {
                if(c=='7') answer++;
            }
            
        }
        
        return answer;
    }
}