import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // age > 17 || weight >= 80 -> Senior
        while (true) {
            String name = s.next();
            int age = s.nextInt();
            int weight = s.nextInt();

            if(name.equals("#") && age == 0 && weight == 0) break;

            if(age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}