import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = m; i <= n; i++) {
            if(isPrime(i)) {
                if(min > i) {
                    min = i;
                }
                sum += i;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }

    }
    static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}