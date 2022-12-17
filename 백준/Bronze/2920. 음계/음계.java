import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replace(" ", "");

        String ascending = "12345678";
        String descending = "87654321";

        if(str.equals(ascending)) {
            System.out.println("ascending");
        } else if (str.equals(descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}