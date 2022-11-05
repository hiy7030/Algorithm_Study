import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

       for(char i = 'a'; i <= 'z'; i++) {
           System.out.print(str.indexOf(i) + " ");
       }

    }
}