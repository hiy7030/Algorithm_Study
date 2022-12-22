import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 시
        int b = Integer.parseInt(st.nextToken()); // 분
        int c = Integer.parseInt(br.readLine());

        int min = (a*60) + b;
        min += c;

        int h = (min/60) % 24;
        int m = min % 60;

        System.out.println(h + " " + m);
    }
}