package pattern.Recursion;

public class RemoveDuplicatesStr {
    public static void removedup(String str,int idx,StringBuilder newStr ,boolean map[]){
        //Base Case
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] ==true){
            //true matlab curr char duplicate hai
            removedup(str,idx+1,newStr,map);
        }else {
            map[currChar-'a'] =true;
            removedup(str,idx+1,newStr.append(currChar),map);
        }
    }
    //calling

    public static void main(String[] args) {
        String str = "vanshhpatil";
       removedup(str,0,new StringBuilder(""),new boolean[26]);
    }
}
