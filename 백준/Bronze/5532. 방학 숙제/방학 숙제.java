import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine()); 
        int A = Integer.parseInt(br.readLine()); 
        int B = Integer.parseInt(br.readLine()); 
        int C = Integer.parseInt(br.readLine()); 
        int D = Integer.parseInt(br.readLine());
        
        int day = 0;
        while (true) {
            A -= C;
            B -= D;
            day++;
            if(A <= 0 && B <= 0) {
                L -= day;
                break;
            }
        }
        System.out.println(L);
    }
}