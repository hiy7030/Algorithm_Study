import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String str = s.nextLine();
            if(str.equals("#")) break;
            String str2 = str.toLowerCase();
            int sum = 0;
            for(int i = 0; i < str2.length(); i++) {
                if(str2.charAt(i) == 'a'
                        || str2.charAt(i) == 'e'
                        || str2.charAt(i) == 'i'
                        || str2.charAt(i) == 'o'
                        || str2.charAt(i) == 'u') {
                    sum += 1;
                }
            }
            System.out.println(sum);
        }
    }
}