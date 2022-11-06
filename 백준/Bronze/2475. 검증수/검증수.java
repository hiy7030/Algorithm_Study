import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i<arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int sum = 0;

        for(int i = 0; i<arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }

        int result = sum % 10;

        System.out.println(result);

    }
}