//find the maximum element in the array using recurrsion

public class p15 {

    static int maxEle(int[] a,int i){
        int max = a[i];

        if(i==a.length-1)
        return max;

        return Math.max(max,maxEle(a, i+1));
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maxEle(nums, 0));
    }
}
