//Print all the vowels of a string using recurssion

public class p7{
    static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        return true;
        else 
        return false;
    }
    static void printing(String S,int n){
        if(n<0)
        return;
        printing(S, n-1);
        char c = S.charAt(n);
        if(isVowel(c))
        System.out.print(c+" ");
    }
    public static void main(String[] args) {
        String str = "Netaji Sai Suru";
        str = str.toLowerCase();
        System.out.println(str);
        printing(str, str.length()-1);
    }
}