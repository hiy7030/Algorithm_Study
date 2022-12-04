import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int p = s.nextInt();
        int multi = l*p;

        // l*P 기준으로
        while (s.hasNext()){
            int result = s.nextInt();
            System.out.print(result - multi + " ");
        }
    }
}