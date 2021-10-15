import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());*/
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + chessBoardCoord(j, i);
                else chessBoard[i][j] = "B" + chessBoardCoord(j, i);

            }
        }

        for (int i = 0; i < chessBoard.length; i++) {

            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7 || b > 7)) return null;
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b));
    }
}
