//Finding Minimum and Maximum of the array

public class p6 {
    static int maximum(int i,int[] a){
        if(i==a.length-1)
        return a[i];
        int max = maximum(i+1,a);
        if(a[i]>max)
        return a[i];
        else
        return max;
    }

    static int minimum(int i,int[] a){
        if(i==a.length-1)
        return a[i];
        int min = minimum(i+1, a);
        if(a[i]<min)
        return a[i];
        else
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,0,8,4,5,6};
        System.out.println(maximum(0,nums));
        System.out.println(minimum(0,nums));
    }
}
