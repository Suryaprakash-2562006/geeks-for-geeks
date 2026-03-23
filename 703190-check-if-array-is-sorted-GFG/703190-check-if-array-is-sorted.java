class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        
        boolean isSort = true;
        
        for(int i=arr.length-1;i>0;i--){
            
            if(arr[i] < arr[i-1]){
                isSort = false;
                break;
            }
        }
        
        return isSort;
    }
}