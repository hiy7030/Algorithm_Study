import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 1 -> 6(6 * 1) -> 12(6 * 2) -> 18(6*3) -> 24(6* 4)
        int count = 1;
        int num = 2;

        if(n == 1) {
            System.out.println(count);
        } else {
            while (num <= n) {
                num += (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}