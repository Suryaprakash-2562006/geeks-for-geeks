// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
        int lcm = 0;
        
        for(int i=1;i>=1;i++)
        {
            if((b*i)%a == 0)
            {
               lcm = b*i;
               break;
            }
        }
        
        return lcm;

        // return LCM of a and b
    }
}