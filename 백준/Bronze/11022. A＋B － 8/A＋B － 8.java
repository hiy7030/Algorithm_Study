import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int i = 1;
        while(t != 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int sum = a+b;
            System.out.println(String.format("Case #%d: %d + %d = %d", i, a, b, sum));
            i++;
            t--;
        }
    }
}