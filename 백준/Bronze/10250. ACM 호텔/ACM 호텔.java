import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());
        int h; 
        int w; 
        int n; 
        while (t != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            int floor;
            int room;

            if(n%h == 0) {
                floor = h*100;
                room = n / h;
            } else {
                floor = (n%h)*100;
                room = (n/h) + 1;
            }

            System.out.println(floor + room);
            t--;
        }
    }
}