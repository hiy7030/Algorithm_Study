import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        while (true) {
            BigInteger a = s.nextBigInteger();
            BigInteger b = s.nextBigInteger();

            if(a.equals(BigInteger.valueOf(0)) && b.equals(BigInteger.valueOf(0))) break;

            if(a.compareTo(b) == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}