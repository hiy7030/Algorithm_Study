import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = 1; i < 10; i++) {
            int x = n * i;
            System.out.println(n + " * " + i + " = " + x);
        }
    }
}