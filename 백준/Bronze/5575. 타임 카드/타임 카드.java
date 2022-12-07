import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());

            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());

            // 모든 시간을 초단위로 환산해 계산 후 다시 시분초로 변환
            // 초 : 60 분 : a * 60 시 : a * 3600
            int t1 = s1 + (m1 * 60) + (h1 * 3600);
            int t2 = s2 + (m2 * 60) + (h2 * 3600);

            int result = t2 - t1;

            int s = result % 60;
            int m = (result/60)%60;
            int h = ((result/60)/60) % 24;

            System.out.println(h + " " + m + " " + s);
        }

    }
}
