import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            String[] strings = br.readLine().split(",");
            int result = Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]);
            System.out.println(result);
            n--;
        }
    }
}