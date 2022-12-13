import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // a의 둘레 = 원주율 * 원의 지름
        // c의 가로 길이
        int d1 = Integer.parseInt(br.readLine());
        // a의 반지름
        int d2 = Integer.parseInt(br.readLine());

        double sum = d1 * 2;
        sum += 3.141592 * (d2 * 2);

        System.out.println(sum);
    }
}