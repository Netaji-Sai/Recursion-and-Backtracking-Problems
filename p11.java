//Check whether one string is a subsequence of the other or not using recursion

public class p11 {
    static boolean isSubsequence(String mainString,String subString,int i,int j){
        // If we have reached the end of the subString, return true
        if (j == subString.length()) {
            return true;
        }
        
        // If we have reached the end of the mainString but not the end of the subString, return false
        if (i == mainString.length()) {
            return false;
        }
        
        // If characters match, move to the next characters in both strings
        if (mainString.charAt(i) == subString.charAt(j)) {
            return isSubsequence(mainString, subString, i + 1, j + 1);
        } else {
            // If characters don't match, only move to the next character in the mainString
            return isSubsequence(mainString, subString, i + 1, j);
        }
    }
    public static void main(String[] args) {
        String s1 = "Netaji Sai";
        String s2 = "aii";
        System.out.println(isSubsequence(s1, s2, 0, 0));
    }
}
