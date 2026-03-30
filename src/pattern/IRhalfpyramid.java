package pattern;

public class IRhalfpyramid {
    public static void pyramid(int height){
        for(int i=1;i<=height;i++)
        {//FOR HALF PYRAMID WE USE height-1
            for(int j=1;j<=height-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){//star ke side mein space lagakr full pyramid ban jayga
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        pyramid(8);
    }

}
