class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int odd = 0;
        int even = 0;
        
        int[] ar = new int[2];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        
        ar[0] = odd;
        ar[1] = even;
        
        return ar;
        
    }
}