import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int minus = sc.nextInt();

        int a = (minus + sum) / 2;

         if((minus + sum) % 2 != 0 || sum < minus) {
             System.out.println(-1);
         } else {
             System.out.println(a + " " + (a-minus));
         }
    }
}