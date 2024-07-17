//Find whether target sum is found by sum of few elements within given list using recursion 

import java.util.Arrays;

public class p20 {
    
    static boolean canFormTargetSum(int[] arr, int target){
        Arrays.sort(arr);
        return canFormTargetSumHelper(arr, target,0,0,0);
    }

    static boolean canFormTargetSumHelper(int[] a,int t,int cs,int c,int i){
        //Target Sum is found
        if(cs==t && c>=2){
            return true;
        }
        if(i==a.length || cs>t){
            return false;
        }
        if(canFormTargetSumHelper(a, t,cs+a[i],c+1,i+1)){
            return true;
        }else{
            return canFormTargetSumHelper(a, t,cs,c,i+1);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,5,2,6};
        int target = 9;
        System.out.println(canFormTargetSum(arr, target));
    }
}

