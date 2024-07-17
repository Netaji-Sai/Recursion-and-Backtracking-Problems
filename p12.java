//Print 2-D matrix using recursion, starting from (0, 0) indices till (m - 1, n - 1) indices

public class p12 {
    static void printAll(int[][] a,int i,int j){
        if(i==a.length || j==a[0].length)
        return;
        System.out.print(a[i][j]+" ");
        if(j==a[0].length-1)
        printAll(a, i+1, 0);

        printAll(a, i, j+1);

    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        printAll(a,0,0);
    }
}
