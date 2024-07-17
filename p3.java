//Printing Even Numbers from 1 to n
import java.util.Scanner;

public class p3{
    static void print(int i,int n){
        if(i==1)
        i+=1;
        if(i>n)
        return;
        else{
            //Here we can give condition statemnt and also do but it takes less calls than that
            System.out.print(i+" ");
            print(i+2,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(1,n);
    }
}
