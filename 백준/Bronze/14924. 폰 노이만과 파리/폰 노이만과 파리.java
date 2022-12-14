import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // s = 기차의 속도, t = 파리의 속도, d = 두 기차 사이의 거리 d/(s*2) = 만나는 시간 t2
        // result = 두 기차가 만날 때까지 파리의 이동 거리   -> t2 * t
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int t2 = d/(s*2);
        int result = t2 * t;

        System.out.println(result);
    }
}