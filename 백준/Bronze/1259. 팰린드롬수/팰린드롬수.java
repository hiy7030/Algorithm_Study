import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if(Integer.parseInt(str) == 0) {
                break;
            }

            StringBuffer sb = new StringBuffer(str);

            String reverse = sb.reverse().toString();

            if(str.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}