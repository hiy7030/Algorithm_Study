import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] memo = new int[46];
        int n = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(n, memo));

    }
    static int fibonacci(int n, int[] memo) {
        if(n <= 1) {
            return n;
        } else if (memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo);
        }
    }
}