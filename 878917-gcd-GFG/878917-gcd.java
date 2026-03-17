class Solution {
    public int computeGCD(int a, int b) {
        // code here
        int gcd = 0;
        
        if(a==1 || b==1)
        {
           gcd = 1;
        }
        
        else if(a==b)
        {
           gcd = a;
        }
        
        
        for(int i=2;i<=Math.min(a,b);i++)
        {
            
            if(a==1 || b==1)
            {
              break;
            }
            
            else if(a==b)
            {
              break;
            }
            
            
            
            if(a%i == 0 && b%i==0)
            {
                gcd = i;
                break;
            }
            
        }
        
        return gcd;
    }
}
