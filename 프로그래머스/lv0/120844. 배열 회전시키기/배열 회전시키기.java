class Solution {
    public int[] solution(int[] numbers, String direction) {
        // right 모든 idx+1, numbers.length-1 -> 0
        // left 모든 idx -1, 0 -> numbers.length-1;
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
        } else {
            answer[answer.length-1] = numbers[0];
        }
        
        for(int i = 0; i < numbers.length-1; i++) {
            if(direction.equals("right")) answer[i + 1] = numbers[i];
            else answer[i]=numbers[i+1];
        } 
        
        return answer;
    }
}