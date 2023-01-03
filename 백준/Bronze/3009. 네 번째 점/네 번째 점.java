import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());

        int resultX = 0;
        int resultY = 0;

        if(x1 == x2) {
            resultX = x3;
        } else if (x2 == x3) {
            resultX = x1;
        } else {
            resultX = x2;
        }

        if(y1 == y2) {
            resultY = y3;
        } else if (y2 == y3) {
            resultY = y1;
        } else {
            resultY = y2;
        }

        System.out.println(resultX + " " + resultY);

    }
}