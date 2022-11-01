import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] arr = str.split(" ");

        long one = Long.parseLong(arr[0]);
        long twe = Long.parseLong(arr[1]);
        long tre = Long.parseLong(arr[2]);

        System.out.println(one + twe + tre);
    }
}