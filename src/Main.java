import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int maxRow = 10;
        int maxCol = 10;
        int[][] board = new int[maxRow][maxCol];
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = (int) (y + maxCol * x);
            }
        }

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(String.format("%02d", board[x][y]) + "|");
            }
            System.out.println();
        }
        var scanner = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("Bitte geben sie eine Zahl ein: ");
             a = scanner.nextInt();

            for (int x = 0; x < board.length; x++) {
                for (int y = 0; y < board[x].length; y++) {
                    if (a == board[x][y])
                        System.out.println("Die Zahl wurde auf position: " + "x: " + x + " Y: " + y);
                }
            }
            if (a>=maxRow*maxCol){
                System.out.println("Zahl nicht vorhanden!!");
            }
        } while(a<maxRow*maxCol);
    }
}
