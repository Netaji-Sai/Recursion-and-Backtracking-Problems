//Reverse a number using recursion

public class p14 {
    static int reversed(int n,int r){
        if(n==0)
        return r;
        else{
            r = r*10 + n%10;
            return reversed(n/10, r);
        }
    }
    public static void main(String[] args) {
        int n = 987;
        System.out.println(reversed(n,0));
    }
}
