import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        for(int i=0; i<str.length; i++) {
            switch (str[i]){
                case "A" :
                    str[i] = "10";
                    break;
                case "B" :
                    str[i] = "11";
                    break;
                case "C" :
                    str[i] = "12";
                    break;
                case "D" :
                    str[i] = "13";
                    break;
                case "E" :
                    str[i] = "14";
                    break;
                case "F" :
                    str[i] = "15";
                    break;
            }
        }

        int result = 0;
        int j = 0;

        for(int i = str.length-1; i >=0; i--) {
            double pow = Math.pow(16, j);
            result += (Integer.parseInt(str[i]) * pow);
            j++;
        }
        System.out.println(result);
    }
}