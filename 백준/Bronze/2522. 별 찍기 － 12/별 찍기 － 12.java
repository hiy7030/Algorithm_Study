import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int blank = n - 1;
        int star = 1;
        int line = n-1;
        int blank2 = 1;
        int star2 = n-1;

        while (n != 0){
            for(int i = blank; i > 0; i--) {
                System.out.print(" ");
            }
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
            blank--;
            star++;
        }

        while (line != 0) {
            for(int i = 0; i < blank2; i++) {
                System.out.print(" ");
            }
            for(int j = 0; j <star2; j++) {
                System.out.print("*");
            }
            System.out.println();
            line--;
            blank2++;
            star2--;
        }

    }
}