import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int star = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            star++;
        }

        star = n-1;

        for(int i = 0; i < n-1; i++) {
            for(int j=0; j < star; j++){
                System.out.print("*");
            }
            System.out.println();
            star--;
        }
    }
}
