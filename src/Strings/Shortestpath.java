package pattern.Strings;
import java.util.*;
public class Shortestpath {
    public static float shortest(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            } else if (dir=='N') {
             y++;
            } else if (dir=='E') {
               x++;
            }else x--;
        }
        int X = x*x;
        int Y = y*y;
        return (float) Math.sqrt(X+Y);
    }
    public static void main(String[] args) {
        String path="NS";
        System.out.println("Shortest Path is  :" + shortest(path));
    }
}
