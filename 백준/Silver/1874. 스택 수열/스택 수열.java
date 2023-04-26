import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 들어올 정수의 수
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        // arr[i]요소가 될때까지 1~n 숫자를 push
        // stack에는 push되든 pop되든 1~n 순서대로 입력해야함
        int start = 0;
        // stack.peek() == arr[i] 이면 pop 해야함
        // stack.push할 start값이 arr[i]보다 크다면 no
        for(int i = 1; i <= n; i++) {
            if(start < arr[i]) {
                for(int j = start+1; j <= arr[i]; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = arr[i];
            } else if (stack.peek() != arr[i]) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}