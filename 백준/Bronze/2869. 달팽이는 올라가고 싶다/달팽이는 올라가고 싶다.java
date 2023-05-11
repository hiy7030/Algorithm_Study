import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 낮에 올라가는 길이
        int a = Integer.parseInt(st.nextToken());
        // 밤에 미끄러지는 길이
        int b = Integer.parseInt(st.nextToken());
        // 총 높이
        int v = Integer.parseInt(st.nextToken());
        // 올라간 일수
        int day = (v-b)/(a-b);

        if((v-b)%(a-b) != 0) day++;

        System.out.println(day);
    }
}
