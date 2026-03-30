package pattern.BitManipulation;

public class Swaapwothout3rdvariable {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapp"+a+ " "+b);
    }
}
