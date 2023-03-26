import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 이항 계수 n! / k!(n-k)!
        int result = factorial(n) / (factorial(k) * factorial(n-k));

        System.out.println(result);

    }
    public static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}