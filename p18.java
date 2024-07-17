//find the last occurace of target wihtin list using recurrsion

public class p18 {
    static void lastOcc(int[] a,int t,int n){
        if(n==-1)
        return;

        if(a[n]==t){
            System.out.println(n);
            return;
        }

        lastOcc(a, t, n-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,2};
        int tar = 4;
        lastOcc(nums,tar,nums.length-1);
    }
}
