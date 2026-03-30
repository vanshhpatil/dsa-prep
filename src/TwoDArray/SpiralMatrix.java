package pattern.TwoDArray;

public class SpiralMatrix {
public static void printSpiral(int matirx[][]){
    int sRow =0;
    int sCol=0;
    int eRow= matirx.length-1;
    int eCol=matirx[0].length-1;

    while (sRow <=eRow && sCol<=eCol){ //for all n*n,n*m matrix
        //top
        for(int j=sCol;j<=eCol;j++){        //column variable h,row fix
            System.out.print(matirx[sRow][j]+" ");
        }
        //right
        for (int i=sRow+1;i<=eRow;i++) {         //row variable h,col fix
            System.out.print(matirx[i][eCol]+" ");
        }
        //Bottom
        for (int j=eCol-1;j>=sCol;j--){
            if (sRow ==eRow){   //top pe print hua bottom me na print ho
                break;}
            System.out.print(matirx[eRow][j]+" ");


        }

        //left
        for(int i=eRow-1;i>=sRow+1;i--){
            if (sCol==eCol){ //right pe print hua left me na print ho
                break;}
            System.out.print(matirx[i][sCol]+" ");


        }

        sRow++;
        sCol++;
        eRow--;
        eCol--;
    }
    System.out.println(" ");


}
    public static void main(String[] args) {
        int matirx[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };  //direct value declaration
        printSpiral(matirx);
    }
}
