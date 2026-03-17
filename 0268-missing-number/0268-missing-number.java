class Solution {
    public int missingNumber(int[] nums) {

        int arraycount = 0;
        int sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            arraycount+=nums[i];
        }

        for(int i=1;i<=nums.length;i++)
        {
            sum+=i;
        }

        

        return Math.abs(arraycount-sum);
        
    }
}