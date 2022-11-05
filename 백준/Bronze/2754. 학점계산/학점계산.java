import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        Map<String, String> result = new HashMap<>();
        result.put("A+", "4.3");
        result.put("A0", "4.0");
        result.put("A-", "3.7");
        result.put("B+", "3.3");
        result.put("B0", "3.0");
        result.put("B-", "2.7");
        result.put("C+", "2.3");
        result.put("C0", "2.0");
        result.put("C-", "1.7");
        result.put("D+", "1.3");
        result.put("D0", "1.0");
        result.put("D-", "0.7");
        result.put("F", "0.0");

        System.out.println(result.get(str));
    }
}