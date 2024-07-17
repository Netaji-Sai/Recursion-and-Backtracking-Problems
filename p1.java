//Print 1 to n numbers
import java.util.Scanner;

public class p1{
    static void solve(int i,int n){
        if(i>n)
        return;
        else{
            System.out.print(i+" ");
            solve(i+1,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        solve(1,n);
    }
}