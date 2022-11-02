import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();

        int result = 1;

        if(n == 0) {
            System.out.println(1);
        } else {
            for(int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}