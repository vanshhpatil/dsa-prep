package Backtracking;

public class nQueensAllway {

    public static boolean isSafe(char chessBoard[][],int row,int col){
//vertical up
        for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col]=='Q') {
                return false;
            }
        }
        //Diagonal left up
        for(int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        //Diagonal right up
        for(int i=row-1,j=col+1;i>=0 &&j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char chessBoard[][],int row){

        //base
        if(row == chessBoard.length){
            printBoard(chessBoard);
            return;
        }
        //column loop
        for(int j=0;j<chessBoard.length;j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j]='Q';
                nQueens(chessBoard,row+1); //function call kiya
                chessBoard[row][j]='.';
            }
        }
    }

    public static void printBoard(char chessBoard[][]){
        System.out.println("__________Chess Board_____________");
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n=6;
        char chessBoard[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessBoard[i][j]='.';
            }
        }

        nQueens(chessBoard, 0);
    }
}
