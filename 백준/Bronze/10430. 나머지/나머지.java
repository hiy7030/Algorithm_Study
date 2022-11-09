import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        int one = (int)((A+B)%C);
        int two = (int)(((A%C) + (B%C))%C);
        int three = (int)((A*B)%C);
        int four = (int)(((A%C) * (B%C))%C);

        System.out.println(one +"\n"+ two +"\n"+ three +"\n"+ four);
    }
}