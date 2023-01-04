import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        double pi = 3.14159265359;

        double u = r * r * pi;
        double t = r * r * 2;

        System.out.printf("%.6f\n%.6f", u, t);

    }
}