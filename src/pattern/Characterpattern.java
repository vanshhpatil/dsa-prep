package pattern;

public class Characterpattern {
    public static void main(String[] args) {
        char ch='A';
    int n=7;
    for (int line=1;line<=n;line++){
        for (int letter=1;letter <=line;letter++){

            System.out.print(ch);
            ch++;

        }
        System.out.println();
    }
    }
}
