package Backtracking;

public class nqueensOnesolution {
    public static boolean isSafe(char chessBoard[][], int row, int col) {
//vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        //Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        //Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char chessBoard[][], int row) {

        //base
        if (row == chessBoard.length) {
            //printBoard(chessBoard);
            count ++;
            return true;
        }
        //column loop
        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                if(nQueens(chessBoard, row + 1)){
                    return true;
                } //function call kiya
                chessBoard[row][j] = '.'; //backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char chessBoard[][]) {
        System.out.println("__________Chess Board_____________");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String args[]) {
        int n = 5;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = '.';
            }
        }
       if( nQueens(chessBoard, 0)){
           System.out.println("Solution is possible");
           printBoard(chessBoard);
       } else {
           System.out.println("soltion is not possible");
       }
        //System.out.println("No Of ways are :"+ count);
    }
}
