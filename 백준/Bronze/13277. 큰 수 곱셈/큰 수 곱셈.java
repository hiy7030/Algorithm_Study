import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();

        BigInteger result = a.multiply(b);
        System.out.println(result);
    }
}