class Solution {
    public static int gcd(int A, int B) {
        
        int gcd = 1;

        for(int i = 1; i <= Math.min(A, B); i++)
        {
            if(A % i == 0 && B % i == 0)
            {
                gcd = i;
            }
        }

        return gcd;
    }
}