import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        
        king -= s.nextInt();
        queen -= s.nextInt();
        rook -= s.nextInt();
        bishop -= s.nextInt();;
        knight -= s.nextInt();
        pawn -= s.nextInt();

        System.out.print(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
     }
}