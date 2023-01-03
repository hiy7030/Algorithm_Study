import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int line = (2 * n - 1)/2;
        int star = 2 * n - 1;
        int blank = 0;

        while (line != 0) {
            for(int i = 0; i < blank; i++) {
                System.out.print(" ");
            } for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            line--;
            blank++;
            star -= 2;
        }

        int n2 = 2*n-1;
        int blank2 = n2 / 2;
        int star2 = 1;

        while (n != 0) {
            for(int i = blank2; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star2; j++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
            blank2--;
            star2 += 2;
        }
    }
}