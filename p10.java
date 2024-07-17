/*
Check whether one string is a substring of the other or not using recursion
String: "apple"

Substrings: "app", "le", "pl", "e"
Subsequences: "ape", "apl", "ae", "pp", "l"
*/

public class p10 {
    static boolean isSubstring(String s1,String s2,int i,int j){
        //if sub string reached to end
        if(j==s2.length())
        return true;
        //if main string reached end we don't find substring
        if(i==s1.length())
        return false;

        if(s1.charAt(i)==s2.charAt(j)){
            return isSubstring(s1, s2, i+1, j+1);
        }
        else{
            return isSubstring(s1, s2, i+1, 0);
        }
    }
    public static void main(String[] args) {
        String str = "Netaji Sai";
        String sstr = "Sai";
        System.out.println(isSubstring(str,sstr,0,0));
    }
}
