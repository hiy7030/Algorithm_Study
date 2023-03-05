import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (k != 0) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
            k--;
        }

        int sum = 0;
        int length = stack.size();

        for(int i = 0; i < length; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}