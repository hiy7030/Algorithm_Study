import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        long M = s.nextLong();

        // 절대값 : Math.abs
        long result = 0;
        if(N>=M) {
            result = N-M;
        } else {
            result = M-N;
        }

        System.out.println(result);
    }
}