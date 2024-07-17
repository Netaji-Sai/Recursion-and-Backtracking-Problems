//Printing list from left to right and right to left

public class p4 {
    static void ltr(int i,int[] a){
        if(i==a.length)
        return;
        else{
            System.out.print(a[i]+" ");
            ltr(i+1,a);
        }
    }

    static void rtl(int i,int[] a){
        if(i==a.length)
        return;
        else{
            rtl(i+1,a);
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ltr(0,nums);
        System.out.println();
        rtl(0,nums);
    }
}
