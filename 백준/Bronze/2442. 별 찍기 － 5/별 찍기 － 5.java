import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int n2 = 2*n-1;
        int blank = n2 / 2;
        int star = 1;

        while (n != 0) {
            for(int i = blank; i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            n--;
            blank--;
            star += 2;
        }
    }
}