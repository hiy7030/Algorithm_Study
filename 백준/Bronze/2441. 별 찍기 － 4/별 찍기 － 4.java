import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 0~n-1까지 공백 출력
        // n~1까지 * 출력
        for(int i = 0; i < n; i++) { // i = 0
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k < n; k++) {
                System.out.print("*"); // n개 출력
            }
            System.out.println();
        }
    }
}