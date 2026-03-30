package pattern.Backtracking;
public class SubsetOfString {
    public static void findSubset(String str,String ans,int i){
        //base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //recursive fxn
//yes ke liye -
        findSubset(str,ans+str.charAt(i),i+1);
        //no ke liye
        findSubset(str,ans,i+1);
        //backtrack kaam
    }
    public static void main(String[] args) {
        String str="abc";
        findSubset(str,"",0);
    }
}
