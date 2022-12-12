import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        if(n % 8 == 0) {
            System.out.println(2);
        } else if (n % 4 == 3) {
            System.out.println(3);
        } else if (n % 8 == 6) {
            System.out.println(4);
        } else {
            System.out.println(n % 8);
        }
    }
}