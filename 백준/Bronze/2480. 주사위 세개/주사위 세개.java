import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        int sum = 0;

        if(n1 == n2 && n2 == n3 && n3 == n1) {
            sum = 10000 + n1 * 1000;
        } else if (n1 == n2 ||  n1 == n3) {
            sum = 1000 + n1 * 100;
        } else if (n2 == n3) {
            sum = 1000 + n2 * 100;
        } else {
            int max = Math.max(n1, n2);
            int maxMax = Math.max(max, n3);
            sum = maxMax * 100;
        }
        System.out.println(sum);
    }
}