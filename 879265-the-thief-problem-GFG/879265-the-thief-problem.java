import java.util.*;

class Solution {
    public static int getMaxVal(int arr[], int k) {
        Arrays.sort(arr); // sort ascending
        
        int sum = 0;
        int n = arr.length;
        
        // pick last k elements (largest)
        for (int i = n - 1; i >= n - k; i--) {
            sum += arr[i];
        }
        
        return sum;
    }
}