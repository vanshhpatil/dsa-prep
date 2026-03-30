package pattern.Strings;

public class LexicoGraphicLargest {
    public static void main(String[] args) {
        String vegies[]={"patato","tomato","onion"};
        String Largest = vegies[0];
        for (int i =0; i < vegies.length; i++) {
            if(Largest.compareTo(vegies[i])<0){
                Largest=vegies[i];
            }
        }
        System.out.println(Largest);
    }
}
