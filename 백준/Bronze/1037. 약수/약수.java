import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while (n-- > 0) {
            int a = Integer.parseInt(st.nextToken());
            max = Math.max(a, max);
            min = Math.min(a, min);
        }
        System.out.println(max * min);
    }
}
