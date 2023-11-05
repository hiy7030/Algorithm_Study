import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if(s.length() % 2 != 0 || s.charAt(s.length()-1)=='(' || s.charAt(0) ==')') return false;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.isEmpty()) {
                if(c == ')') return false;
                else stack.push(c);
            } else {
                if(c == '(') stack.push(c);
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}