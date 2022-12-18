import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder stringBuilder = new StringBuilder(a);
        String reverseA = stringBuilder.reverse().toString();
        StringBuilder stringBuilder1 = new StringBuilder(b);
        String reverseB = stringBuilder1.reverse().toString();

        System.out.println(Math.max(Integer.parseInt(reverseA), Integer.parseInt(reverseB)));
    }
}