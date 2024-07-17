//Print all possible permutations of a given list using recursion

public class p21 {

    static void printArray(int[] nums){
        System.out.print("[");
        for(int i = 0;i<nums.length;i++){
            if(i==nums.length-1)
            System.out.print(nums[i]);
            else
            System.out.print(nums[i]+",");
        }
        System.out.println("]");
    }

    static void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    static void printSubsets(int[] nums,int fi,int n){
        if(fi==n){
            printArray(nums);
        }
        for(int i = fi;i<=n;i++){
            swap(nums,i,fi);
            printSubsets(nums, fi+1, n);
            swap(nums,i,fi);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        printSubsets(nums,0,nums.length-1);
    }
}
