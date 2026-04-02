class Solution {
    public int kthElement(int a[], int b[], int k) {

    

        // determines length of both arrays
        int a1 = a.length;
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        int[] c = new int[c1];

        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);

        
        
         
        Arrays.sort(c);

        // Print sorted arrays
        return c[k-1];
        

        //return -1; // never reached
    }
}
