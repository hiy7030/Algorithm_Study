import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] bugger = new int[]{Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())};
        int[] drink = new int[]{Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())};

        int min = 4000;

        for(int i = 0; i < bugger.length; i++) {
            for(int j = 0; j < drink.length; j++) {
                if(min > bugger[i] + drink[j]) {
                    min = bugger[i] + drink[j];
                }
            }
        }
        System.out.println(min-50);
    }
}