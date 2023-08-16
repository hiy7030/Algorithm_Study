import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        int i = 0;
        
        while(i < arr.length) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
                i++;
            } else {
                if(stack.peek() < arr[i]) {
                    stack.push(arr[i]);
                    i++;
                } else {
                    stack.pop();
                }
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int j = answer.length-1; j >= 0; j--) {
            answer[j] = stack.pop();
        }
        
        return answer;
    }
}