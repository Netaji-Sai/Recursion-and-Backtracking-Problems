//Check whether given string is a palindrome or not using recursion

public class p8 {
    static boolean isPalindrome(String s,int i,int j){
        //base codition
        if(i>j)
        return true; 

        boolean res = isPalindrome(s, i+1, j-1);
        char c1 = s.charAt(i);
        char c2 = s.charAt(j);
        if(c1==c2){
            return true && res; //by using end operation we can find that all other recursive calls has true or not
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
}
