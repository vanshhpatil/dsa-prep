package pattern.Strings;
import java.util.*;
public class FirstLetterUpperCase {

    public static String toUpperCase(String intro){
        StringBuilder sb = new StringBuilder("");
char ch = Character.toUpperCase(intro.charAt(0));
sb.append(ch);
        for (int i =1; i < intro.length() ; i++) {
            if(intro.charAt(i)==' ' && i<intro.length()-1){
                sb.append(intro.charAt(i));
                i++;
              sb.append(Character.toUpperCase(intro.charAt(i)));
            }else {
                sb.append(intro.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String intro="Hello my name is Vansh patil";
        System.out.println(toUpperCase(intro));
    }
}
