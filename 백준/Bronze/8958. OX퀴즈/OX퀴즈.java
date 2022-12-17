import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 0를 만나면 점수가 1 올라가고 플러스 , x를 만나면 점수는 0
        while (n != 0) {
            String str = br.readLine();
            int score = 0;
            int result = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'O') {
                    score++;
                    result += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(result);
            n--;
        }
    }
}