//Print n to 1 numbers
import java.util.Scanner;

public class p2{
    static void solve(int i,int n){
        if(i>n)
        return;
        else{
            solve(i+1,n);
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        solve(1,n);
    }
}