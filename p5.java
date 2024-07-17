//Finding sum of list of integers in a list 

public class p5 {
    static int sum(int i,int[] a){
        int c = a[i];
        if(i==a.length-1){
            return c;
        }
        else{
            return c + sum(i+1,a); 
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(sum(0, nums));
    }
}
