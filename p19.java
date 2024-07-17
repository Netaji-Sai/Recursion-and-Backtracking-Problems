//Find the total frequency of a target within list using recursion

public class p19 {
    static int freqTarget(int[] a,int t,int i,int c){
        if(i==a.length){
            return c;
        }
        if(a[i]==t){
            c++;
        }
        return freqTarget(a, t, i+1,c);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,3,4,3,2,1};
        int tar = 1;
        System.out.println(freqTarget(nums,tar,0,0));
    }
}
