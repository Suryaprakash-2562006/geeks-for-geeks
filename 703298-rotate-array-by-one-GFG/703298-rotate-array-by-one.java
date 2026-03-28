// // User function Template for Java

class Solution 
{
    public void rotate(int[] arr)
    {
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1];
            arr[arr.length-1] = temp;
            
        }
        
        
        
    }
}