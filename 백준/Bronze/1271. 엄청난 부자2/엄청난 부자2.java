import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();

        BigInteger c = a.divide(b);
        BigInteger d = a.remainder(b);

        System.out.println(c + "\n" + d );

    }
}