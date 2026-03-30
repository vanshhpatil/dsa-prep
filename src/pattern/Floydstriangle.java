package pattern;

public class Floydstriangle{
    public static void main(String[] args) {
        int val=1;
        int n=7;
        for (int line=1;line<=n;line++){
            for (int letter=1;letter <=line;letter++){

                System.out.print( val+" " );

                val++;

            }
            System.out.println();
        }
    }
}
