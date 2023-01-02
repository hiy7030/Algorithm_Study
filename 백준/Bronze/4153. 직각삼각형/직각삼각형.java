import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            Arrays.sort(arr);
            if(arr[1] == 0 && arr[2] == 0 && arr[0] == 0) {
                break;
            }

            int a = (int) Math.pow(arr[arr.length-1], 2);
            int b = (int) (Math.pow(arr[0], 2) + Math.pow(arr[1], 2));

            if(a == b) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}