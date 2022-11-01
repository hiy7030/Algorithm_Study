import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();

        if(first > 0 && second > 0) {
            System.out.println(1);
        } else if (first < 0 && second > 0)  {
            System.out.println(2);
        } else if(first < 0 && second < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

    }
}