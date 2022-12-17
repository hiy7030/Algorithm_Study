import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int max = -1000000;
        int min = 1000000;

        for(int i = 0; i < num.length; i++) {
            if(max < num[i]) {
                max = num[i];
            }
            if(min > num[i]) {
                min = num[i];
            }
        }

        System.out.println(min + " " + max );
    }
}