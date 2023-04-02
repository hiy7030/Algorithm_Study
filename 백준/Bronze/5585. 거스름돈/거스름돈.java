import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000;
        // 지불한 돈
        int pay = Integer.parseInt(br.readLine());
        // 잔돈
        int cash = money-pay;
        int result = 0;

        int[] charge = new int[]{500, 100, 50, 10, 5, 1};

        for(int i = 0; i < charge.length; i++) {
            result += (cash/charge[i]);
            cash = cash%charge[i];
        }

        System.out.println(result);
    }
}
