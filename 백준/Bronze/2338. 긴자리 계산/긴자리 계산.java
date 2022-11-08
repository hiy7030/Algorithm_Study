import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        BigInteger b = s.nextBigInteger();

        BigInteger add = a.add(b);
        BigInteger sub = a.subtract(b);
        BigInteger multi = a.multiply(b);

        System.out.println(add + "\n" + sub + "\n" + multi );

    }
}