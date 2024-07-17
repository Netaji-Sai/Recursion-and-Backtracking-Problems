//Check whether 2 strings are same or not using recursion

public class p9 {
    static boolean isSame(String s1,String s2,int i){
        if(s1.length()!=s2.length())
        return false;
        
        if(i==s1.length())
        return true;

        boolean res = isSame(s1,s2,i+1);

        if(s1.charAt(i)==s2.charAt(i)){
            return res && true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "Sai";
        String str2 = "Sei";
        System.out.println(isSame(str1, str2, 0));
    }
}
