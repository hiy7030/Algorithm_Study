import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        // 아스키코드-> a - 65 = 0 0 -> index?
        int[] abc = new int[26];

        for(int i = 0; i < str.length(); i++) {
            // str.charAt(i) 의 값 - 65 -> abc의 인덱스 값
            int index = str.charAt(i) - 65;
            abc[index]++;
        }

        int max = 0;
        char ch = '?';

        for(int i = 0; i < abc.length; i++) {
            if(abc[i] > max) {
                max = abc[i];
                ch = (char) (i + 65);
            } else if (abc[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);

    }
}