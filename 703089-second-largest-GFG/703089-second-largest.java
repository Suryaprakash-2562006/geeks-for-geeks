class Solution {
    public int getSecondLargest(int[] arr) {
        
        int large = arr[0];
        int slarge = -1;
        
        for(int i = 1; i < arr.length; i++) {
            
            if(arr[i] > large) {
                slarge = large;   // store previous largest
                large = arr[i];
            }
            else if(arr[i] < large && arr[i] > slarge) {
                slarge = arr[i];
            }
        }
        
        return slarge;
    }
}