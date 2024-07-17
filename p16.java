//Print the minimum element in the array using recursion

public class p16 {
    static int minEle(int[] a,int i){
        int min = a[i];

        if(i==a.length-1)
        return min;

        return Math.min(min,minEle(a, i+1));
    }
    public static void main(String[] args) {
        int[] nums = {4,2,1,3};
        System.out.println(minEle(nums,0));
    }
}
