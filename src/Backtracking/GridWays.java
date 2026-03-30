package Backtracking;

public class GridWays {

    public static int gridway(int i,int j,int n ,int m){
        //base cond
        if(i==n-1 && j==m-1){   //last cell cond.
            return 1;
        } else if (i==n || j==m) { //boundary cross cond.
            return 0;
        }
        int w1 = gridway(i+1,j,n,m);
        int w2 = gridway(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=10,m=10;
        System.out.println(gridway(0,0,n,m));
    }
}
