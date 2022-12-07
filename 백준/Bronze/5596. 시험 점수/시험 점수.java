import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max1 = 0;
        int max2 = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            max1 += Integer.parseInt(st1.nextToken());
            }

        for(int i = 0; i < 4; i++) {
            max2 += Integer.parseInt(st2.nextToken());
        }

        if(max1 >= max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }

    }
}