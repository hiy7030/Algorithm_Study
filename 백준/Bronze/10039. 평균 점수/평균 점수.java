import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;

        while (n != 0) {
            int next = sc.nextInt();

            if(next < 40) {
                sum += 40;
            } else {
                sum += next;
            }
            n--;
        }
        System.out.println(sum / 5);
    }
}