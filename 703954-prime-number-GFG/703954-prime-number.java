class Solution {
    static boolean isPrime(int n) {
        
        
        boolean isPrim = true;
        
        if(n == 1)
        {
            isPrim = false;
        }
        for(int i=2;i<n;i++)
        {
            if(n % i == 0)
            {
                isPrim = false;
            }
        }
        
        return isPrim;
    }
}