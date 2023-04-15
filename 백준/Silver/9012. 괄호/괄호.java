import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            if(findVPS(br.readLine())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
    public static boolean findVPS(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            // "("일 경우 stack.push
            if(str.charAt(i) == '(') stack.push(str.charAt(i));
            // ")"일 경우
            else if (str.charAt(i) == ')') {
                // 스택이 비어있을 경우, return false
                if(!stack.isEmpty()) {
                    stack.pop();
                } else return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}