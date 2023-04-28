import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("c=", "a")
                .replaceAll("c-", "a")
                .replaceAll("dz=", "a")
                .replaceAll("d-", "a")
                .replaceAll("lj", "a")
                .replaceAll("nj","a")
                .replaceAll("s=", "a")
                .replaceAll("z=", "a");

        System.out.println(str.length());
    }
}