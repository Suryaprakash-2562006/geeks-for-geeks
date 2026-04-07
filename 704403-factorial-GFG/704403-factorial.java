// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        int ans = 1;

        // Write your code here
        if(n == 1) return 1;
        
        for(int i=2;i<=n;i++){
            ans = ans * i;
        }

        return ans;
    }
}