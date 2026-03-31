class Solution {
    int convertfive(int num) {
        // Your code here
        
        int rev = 0;
        int r = 0;
        
        if(num == 0) return 5;
        
        while(num > 0){
            int n = num % 10;
            if(n == 0)
            {
                n = 5;
            }
            
            rev = rev * 10 + n;
            
            num /= 10;
        }
        
        
        
        while(rev > 0){
            int n = rev % 10;
            
            r = r * 10 + n;
            
            rev /= 10;
        }
        
        return r;
        
        
    }
}

