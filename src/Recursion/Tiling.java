package pattern.Recursion;

public class Tiling {
    public static int Tilingprblm(int n) {// 2 X n (Floor Size)
        if (n == 0 || n == 1) {
            return 1;
        }
        int nmn1 = Tilingprblm(n - 1); //vertical case
        int nmn2 = Tilingprblm(n - 2);//for horizontal case
        int total = nmn1 + nmn2;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(Tilingprblm(4));
    }
}
