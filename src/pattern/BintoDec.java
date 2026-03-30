package pattern;

public class BintoDec {

    public static void Bindec(int binnum){
    int pow=0;
    int deciNum=0;

    while(binnum >0){
        int lastDigit=binnum%10;

        deciNum=deciNum+(lastDigit*(int)Math.pow(2,pow));
        pow++;
        binnum=  (binnum)/10;
    }
        System.out.println(deciNum);
    }

    public static void main(String[] args) {

        Bindec(111);
    }
}
