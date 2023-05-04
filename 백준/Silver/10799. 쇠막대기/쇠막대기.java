import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(') stack.push(c);
            else {
                stack.pop();
                if(str.charAt(i-1)== '(') {
                    sum += stack.size();
                } else {
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}
