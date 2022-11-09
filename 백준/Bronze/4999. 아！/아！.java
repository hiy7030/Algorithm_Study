import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        if(a.indexOf('h') >= b.indexOf('h')) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}