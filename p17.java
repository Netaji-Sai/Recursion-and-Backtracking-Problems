//find the first occurace of target wihtin list using recurrsion

public class p17 {
    static void firstOcc(int[] a,int t,int i){
        boolean found = false;
        if(i==a.length){
            return;
        }
        if(a[i]==t)
        found = true;
        if(found){
            System.out.println(i);
            return;
        }
        firstOcc(a, t, i+1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,6};
        int target = 4;
        firstOcc(nums,target,0);
    }
}