import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int sum = s+k+h;

        if(sum >= 100) {
            System.out.println("OK");
        } else {
            int min = Math.min(s, k);
            int result = Math.min(min, h);
            if(result == s) {
                System.out.println("Soongsil");
            } else if (result == k) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}