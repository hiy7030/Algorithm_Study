import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        int n = Integer.parseInt(str);
        int result = 0;

        int num = n-(length*9);

        for(int i = num; i<n; i++) {
            int number = i;
            int sum = 0;
            while (number != 0) {
                sum += number%10;
                number/=10;
            }
            if(sum+i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}