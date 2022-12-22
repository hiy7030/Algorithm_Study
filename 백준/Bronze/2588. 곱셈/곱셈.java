import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        String n2 = br.readLine();

        int result1 = n1 * (n2.charAt(2)-'0');
        int result2 = n1 * (n2.charAt(1)-'0');
        int result3 = n1 * (n2.charAt(0)-'0');
        int result4 = n1 * Integer.parseInt(n2);

        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4);
    }
}