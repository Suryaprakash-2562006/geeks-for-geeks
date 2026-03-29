
class Solution {
    public static boolean isPerfect(int[] arr) {
        // code here
        boolean isPalind = true;
        
        int i=0;
        int j=arr.length-1;
        
        while(i<j)
        {
            if(arr[i] != arr[j])
            {
                isPalind = false;
                break;
            }
            
            i++;
            j--;
        }
        
        if(isPalind){
            return true;
        }
        
        return false;
    }
}
