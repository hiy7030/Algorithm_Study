import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine(); // 2진수

        // n : 2 -> 10
        BigInteger num1  = twoToTen(n);
        // n 의 17배
        num1 = num1.multiply(BigInteger.valueOf(17));
        // n : 10 -> 2
        String reverse = tenToTwo(num1);
        StringBuilder str = new StringBuilder(reverse);
        String result = str.reverse().toString();

        System.out.println(result);

    }
    // 2 -> 10
    public static BigInteger twoToTen(String n) {
        // i 번째의 숫자와 2의 i 제곱을 곱한 값을 더해 나가야함!
        BigInteger result = new BigInteger("0");
        BigInteger i = new BigInteger("1");

        while (n.length() != 0) {
            int num = Integer.parseInt(n.substring(n.length()-1));
            result = result.add(i.multiply(BigInteger.valueOf(num)));
            i = i.multiply(BigInteger.valueOf(2));
            n = n.substring(0, n.length()-1);
        }
//        for(int i = n.length()-1; i >= 0; i--){
//            int math = (int) Math.pow(2, i);
//            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
//            result.add(BigInteger.valueOf((long) math * num));
//        }

        return result;
    }

    // 10 -> 2
    public static String tenToTwo(BigInteger n) {
        // n / 2 = 값 , 나머지가 2진수에 저장 2로 나눈 값이 1이 나오면 종료
        // n = 9
        // n/2 = 4 n%2 = 1
        // n/2 = 2 n%2 = 0
        // n/2 = 1 n%2 = 0
        // n/2 = 1 1
        String result = "";

        while (true) {
            if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
                result += n.toString();
                break;
            }
            result += (n.remainder(BigInteger.valueOf(2))).toString();
            n = n.divide(BigInteger.valueOf(2));
        }
        return result;
    }
}