import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib1(n);
        fib2(n);
        System.out.println(count1 +" " + count2);
    }
    public static int fib1(int n) {
        if(n < 2) {
            count1++;
            return n;
        }
        if(n == 2) {
            count1++;
            return 1;
        }
        return fib1(n-1) + fib1(n-2);
    }
    public static int fib2(int n) {
        int[] memo = new int[n];
        if(n<2) return memo[n] = n;
        for(int i = 2; i < n; i++) {
            count2++;
            memo[i] = memo[i-2] + memo[i-1];
        }
        return memo[n-1];
    }
}