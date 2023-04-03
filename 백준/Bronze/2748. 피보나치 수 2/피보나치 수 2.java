import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] memo = new long[91];

        System.out.println(fibonacci(n, memo));

    }
    static long fibonacci(int n, long[] memo) {
        if(n < 2) return memo[n] = n;
        if(n == 2) return memo[n] = 1;
        else if (memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = fibonacci(n-1, memo) + fibonacci(n-2, memo);
        }
    }
}