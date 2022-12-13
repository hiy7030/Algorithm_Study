import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // a + b -> 1010, 10b, a10일 때의 경우를 생각
        String str = br.readLine();

        if(str.equals("1010")) {
            System.out.println(20);
        } else if (Integer.parseInt(str) % 10 == 0) {
            // a10일 경우 210 a == 2 a를 100으로 나눠?
            int a = Integer.parseInt(str);
            a /= 100;
            System.out.println(a + 10);
        } else { // 10b, ab 102, 37
            // a == ab / 10
            // b == ab % 10
            int a = Integer.parseInt(str) / 10;
            int b = Integer.parseInt(str) % 10;
            System.out.println(a + b);
        }

    }
}