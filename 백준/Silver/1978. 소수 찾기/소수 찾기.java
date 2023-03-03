import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;

        for(int i = 0; i < n; i++) {
            if(isPrime(Integer.parseInt(st.nextToken()))){
                result++;
            }
        }

        System.out.println(result);

    }
    public static boolean isPrime(int num) {
        // 0,1은 소수 x, 소수 : 1과 자기 자신으로만 나눠지는 수
        if(num < 2) {
            return false;
        }
        if(num == 2) {
            return true;
        }

        // num이 2부터 자기 자신의 값까지 순회하면서 나눠지면 소수 아님
        // 순수한 num까지 순회하면 비효율적임. 제곱근까지만 순회하는게 효율적
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}