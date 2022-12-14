import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());

        int sum = t1 + t2;

        int a = Integer.parseInt(br.readLine());
        
        if(sum >= a * 2) {
            System.out.println(sum - (a*2));
        } else {
            System.out.println(sum);
        }

    }
}