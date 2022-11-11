import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        int temp = 0;
        for(int i = 0; i < n.length(); i++) {
            temp = (temp * 10 + (n.charAt(i)- '0')) % 20000303;
        }

        System.out.println(temp);
    }
}
