import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int min = s.nextInt();
        int sec = s.nextInt();
        int time = s.nextInt();
        // time / 60 -> min , time % 60 -> sec
        // min / 60 -> hour , min % 60 -> min
        // sec >= 60 -> min = sec / 60, sec = sec % 60
        // min >= 60 -> hour = min / 60, min = min % 60
        // hour >= 24 -> hour = hour/ 24
        sec += time;
        min += sec / 60;
        sec = sec % 60;
        hour += min / 60;
        min = min % 60;
        hour = hour % 24;

        System.out.println(hour + " " + min + " " + sec);
    }
}