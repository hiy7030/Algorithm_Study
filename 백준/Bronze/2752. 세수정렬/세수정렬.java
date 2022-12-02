import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num = new int[]{s.nextInt(), s.nextInt(), s.nextInt()};

        Arrays.sort(num);

        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}