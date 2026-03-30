package pattern;

public class DiamondPattern {
    public static void pyramid(int n){
        for(int i=1;i<=n;i++)
        {//FOR HALF PYRAMID WE USE height-1
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//star ke side mein space lagakr full pyramid ban jayga
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {//FOR HALF PYRAMID WE USE height-1
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//star ke side mein space lagakr full pyramid ban jayga
                System.out.print("* ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        pyramid(10);
    }

}

