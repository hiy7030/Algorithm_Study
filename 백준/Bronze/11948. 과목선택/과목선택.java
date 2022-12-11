import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int a = sc.nextInt();
        int b = sc.nextInt();

        Arrays.sort(arr);

        int sum = 0;
        for(int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        int max = Math.max(a, b);

        System.out.println(sum + max);
    }
}