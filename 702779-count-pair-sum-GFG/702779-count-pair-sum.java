// User function Template for Java

class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[], int arr2[], int x) {
        // code here.
        
        int count = 0;
        
        int i=0;
        int j=arr2.length-1;
        
        while(i<arr1.length && j>=0 ){
            int sum = arr1[i] + arr2[j];
            
            if(sum == x){
                count++;
                i++;
                j--;
            }
            else if(sum > x){
                j--;
            }
            else
            {
                i++;
            }
        }
        
        return count;
    }
}

