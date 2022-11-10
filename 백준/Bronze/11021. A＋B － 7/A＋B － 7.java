import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int i = 1;
        while(t != 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(String.format("Case #%d: %d", i, a+b));
            i++;
            t--;
        }
    }
}