//Find all digits sum of a number using recursion

public class p13 {
    static int printSum(int n,int sum){
        if(n==0)
        return sum;
        else{
        sum += n%10;
        return printSum(n/10,sum);
        }
    }
    public static void main(String[] args) {
        int n = 9328;
        System.out.println(printSum(n,0));
    }
}
