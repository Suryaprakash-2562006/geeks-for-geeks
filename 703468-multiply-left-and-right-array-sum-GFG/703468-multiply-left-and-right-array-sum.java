// User function Template for Java

class Solution {
    public int multiply(int[] arr) {
        // code here
        int a = arr.length / 2;
        
        int fsum = 0;
        int ssum = 0;
        
        for(int i=0;i<a;i++){
            fsum += arr[i];
        }
        
        for(int i=a;i<arr.length;i++){
            ssum += arr[i];
        }
        
        return fsum * ssum;
    }
}
