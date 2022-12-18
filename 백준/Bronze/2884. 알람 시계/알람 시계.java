import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()); // 45분 전

        // result => m - 45 / if m<45 -> 마이너스 값이 됨 그 값ㅇㅔ 60 더하고, h -1;
        if(m < 45) {
            m = (m-45) + 60;
            if(h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
        } else {
            m -= 45;
        }
        
        System.out.println(String.format("%d %d", h, m));
    }
}