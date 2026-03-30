package pattern;

public class LeetSolution {
    public static boolean isPalindrome(int x){
        String st=Integer.toString(x);
        int n=st.length();
        for(int i=0;i<=n/2;i++){
            if(st.charAt(0)!=st.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrome(2332));
    }
}
