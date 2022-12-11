import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (n != 0) {
            String str = br.readLine();
            if (str.length() > 0) {
                for(int i = m-1; i >=0; i--) {
                    System.out.print(str.charAt(i));
                }
            }
            n--;
            System.out.print("\n");
        }
    }
}