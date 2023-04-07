import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");

        int[] num = new int[arr.length];

        for(int i = 0; i<arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(num);
        StringBuilder sb = new StringBuilder();

        for(int n : num) {
            sb.append(n);
        }

        String result = sb.reverse().toString();

        System.out.println(result);
    }
}