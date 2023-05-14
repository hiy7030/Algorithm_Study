import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // x : 월, y : 일, 1월1일은 월요일
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        // O~6
        String[] day = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int month = 0;

        for(int i = 1; i <= 12; i++) {
            if(x == i) break;
            // i의 값이 1,3,5,7,8,10,12 -> 31
            // 4,6,9,11 -> 30
            // 2 -> 28
            int caseNum = 0;
            if(i == 2) caseNum = 1;
            else if (i == 4 || i == 6 || i == 9 || i == 11) caseNum = 2;
            else caseNum = 3;

            switch (caseNum) {
                case 1 : month += 28; break;
                case 2 : month += 30; break;
                case 3 : month += 31; break;
            }
        }
        month += (y-1);

        System.out.println(day[month % 7]);
    }
}