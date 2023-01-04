import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int star = 2 * n - 1;
        int blank = 0;

        while (n != 0) {
            for(int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for(int i = 0; i < star; i++){
                System.out.print("*");
            }
            System.out.println();
            n--;
            star -= 2;
            blank++;
        }
    }
}