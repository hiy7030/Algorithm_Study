import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        // a = 300, b= 60, c= 10

        int a = 0;
        int b = 0;
        int c = 0;

        int count = 0;

        if(t % 10 != 0) {
            System.out.println(-1);
            return;
        } else {
            a = t/300;
            t = t%300;
            b= t/60;
            t = t%60;
            c = t/10;
        }

        System.out.println(String.format("%d %d %d", a, b, c));

    }
}