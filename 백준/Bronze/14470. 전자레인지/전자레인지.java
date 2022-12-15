import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 원래 고기의 온도(a <= 0 : 얼어잇음, a>0 해동완)
        int a = Integer.parseInt(br.readLine());
        // 목표 온도
        int b = Integer.parseInt(br.readLine());
        // 언 고기의 온도를 1도 올리는데 드는 시간
        int c = Integer.parseInt(br.readLine());
        // 언 고기를 해동하는데 걸리는 시간
        int d = Integer.parseInt(br.readLine());
        // 안 언 고기 1도 데우는데 드는 시간
        int e = Integer.parseInt(br.readLine());
        // 고기를 b로 데우는데 걸리는 시간
        int result = 0;

        if(a<0) {
            //녹임(a의 값이 0도가 될때까지 * c)+해동(d)+데움
            result = (Math.abs(a) * c) + d + b * e;
            System.out.println(result);
        } else {
            // 데움
            result = (b-a) * e;
            System.out.println(result);
        }

    }
}