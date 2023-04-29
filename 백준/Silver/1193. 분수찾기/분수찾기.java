import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // 홀수일때는 x++, y--이고 짝수일 때는 x--. y++
        // n이 몇번째 그룹인지 찾기
        int x = 0;
        int cnt = 0;

        int top = 1;
        int bot = 1;

        while (cnt < n) {
            x++;
            cnt = x*(x+1)/2;
        }
        // n이 해당 그룹에 몇번째인지 찾기
        int num = n-(x-1)*x/2;
        if(x%2==0) {
            top = num;
            bot = x-num+1;
        } else{
            top= x-num+1;
            bot = num;
        }

        System.out.println(top + "/" + bot);

    }
}

