import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int line = n - 1;
        int star = 1;
        int blank = 2*n-2;

        while (line != 0 ) {
            for(int i = 0; i < star; i++) {
                System.out.print("*");
            } for(int j = 0; j < blank; j++) {
                System.out.print(" ");
            } for(int k = 0; k< star; k++) {
                System.out.print("*");
            }
            System.out.println();
            line--;
            star++;
            blank -= 2;
        }
        for (int i = 0; i < (2 * n); i++) {
            System.out.print("*");
        }
        System.out.println();

        line = n - 1;
        star = n - 1;
        blank = 2;
        while (line != 0) {
            for(int i = 0; i < star; i++) {
                System.out.print("*");
            } for(int j = 0; j < blank; j++) {
                System.out.print(" ");
            } for(int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
            line--;
            star--;
            blank += 2;
        }
    }
}