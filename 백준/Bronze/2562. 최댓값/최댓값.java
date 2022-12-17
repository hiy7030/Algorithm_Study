import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i < 9; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        int max = 0;

        for(int i = 0; i < num.size(); i++) {
            if(max < num.get(i)) {
                max = num.get(i);
            }
        }

        int index =  num.indexOf(max)+1;

        System.out.println(max);
        System.out.println(index);
    }
}