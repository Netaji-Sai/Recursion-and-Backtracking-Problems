public class p22 {
    static void getSubsets(int[] a, int[] subset, int i, int j) {
        if (i == a.length) {
            // Print the current subset
            System.out.print("[");
            //Here we use k<j as we consider elemnts upto j without including it
            for (int k = 0; k < j; k++) {
                System.out.print(subset[k] + (k < j - 1 ? ", " : ""));
            }
            System.out.println("]");
        } else {
            /*If we use ArraList
            al.add(a[i]);
            getSubsets(a, al, i + 1, x);
            // Remove the last added element to backtrack
            al.remove(al.size() - 1);
            getSubsets(a, al, i + 1, x);
            */

            // If we use int[] Arrays
            // Include a[i] in the subset
            subset[j] = a[i];
            getSubsets(a, subset, i + 1, j + 1);
            // Exclude a[i] from the subset
            getSubsets(a, subset, i + 1, j);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] subset = new int[a.length];
        getSubsets(a, subset, 0, 0);
    }
}
