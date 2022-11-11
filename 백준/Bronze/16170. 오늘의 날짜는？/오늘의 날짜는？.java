import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDateTime date = LocalDateTime.now();

        System.out.println(date.getYear() + "\n" + date.getMonthValue() + "\n" + date.getDayOfMonth());
    }
}